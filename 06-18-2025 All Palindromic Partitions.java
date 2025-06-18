Problem link - https://www.geeksforgeeks.org/problems/find-all-possible-palindromic-partitions-of-a-string/1?_gl=1*4csfl8*_up*MQ..&gclid=Cj0KCQjwh_i_BhCzARIsANimeoEIpPMx-bYqTx5XofjLvqo6p17z0hEUHvkOxyfrbAJjglEDwaA0fOsaAsmREALw_wcB

class Solution {
    public ArrayList<ArrayList<String>> palinParts(String s) {
        // code here
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        int n = s.length();
        ArrayList<String> ls = new ArrayList<>();
        rec(s,0,ls,ans);
        return ans;
    }
    public void rec(String s,int ind,ArrayList<String> ls,ArrayList<ArrayList<String>> ans)
    {
        if(ind==s.length())
        {
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i = ind;i<s.length();i++)
        {
            if(isPalind(s,ind,i))
            {
                ls.add(s.substring(ind,i+1));
                rec(s,i+1,ls,ans);
                ls.remove(ls.size()-1);
            }
        }
    }
    public boolean isPalind(String s,int strt,int end)
    {
        while(strt<=end)
        {
            if(s.charAt(strt)!=s.charAt(end))
            {
                return false;
            }
            strt++;
            end--;
        }
        return true;
    }
}
