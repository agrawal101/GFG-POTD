// Problem link - https://www.geeksforgeeks.org/problems/case-specific-sorting-of-strings4845/1?_gl=1*vc4skd*_up*MQ..&gclid=Cj0KCQjwh_i_BhCzARIsANimeoEIpPMx-bYqTx5XofjLvqo6p17z0hEUHvkOxyfrbAJjglEDwaA0fOsaAsmREALw_wcB

class Solution {
    public static String caseSort(String s) {
        // code here
        int n = s.length();
        char crr[] = s.toCharArray();
        ArrayList<Character> up = new ArrayList<>();
        ArrayList<Character> lc = new ArrayList<>();
        for(char c:crr)
        {
            if(c>='A' && c<='Z')
            up.add(c);
            else
            lc.add(c);
        }
        Collections.sort(up);
        Collections.sort(lc);
        int j = 0;
        int k = 0;
        for(int i = 0;i<n;i++)
        {
            if(crr[i]>='A' && crr[i]<='Z')
            {
                crr[i] = up.get(j);
                j++;
            }
            else{
                crr[i] = lc.get(k);
                k++;
            }
        }
        return String.valueOf(crr);
    }
}
