// Problem link - https://www.geeksforgeeks.org/problems/group-balls-by-sequence/1?_gl=1*1q0u008*_up*MQ..&gclid=Cj0KCQjwh_i_BhCzARIsANimeoEIpPMx-bYqTx5XofjLvqo6p17z0hEUHvkOxyfrbAJjglEDwaA0fOsaAsmREALw_wcB

class Solution {
    public boolean validgroup(int[] arr, int k) {
        // code here
        if(k==1)
        return true;
        if(arr.length%k!=0)
        return false;
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int x:arr)
            tm.put(x,tm.getOrDefault(x,0)+1);
        while(!tm.isEmpty())
        {
            int x = tm.firstKey();
            for(int i = 0;i<k;i++)
            {
                if(tm.containsKey(x))
                {
                    tm.put(x,tm.get(x)-1);
                    if(tm.get(x)==0)
                    {
                        tm.remove(x);
                    }
                }
                else
                    return false;
                x++;
            }
        }
        return true;
    }
}
