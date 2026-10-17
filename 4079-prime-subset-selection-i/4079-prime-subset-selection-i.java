class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        boolean[] isp = new boolean[n + 1];
        Arrays.fill(isp, true);
        isp[0] = false;
        isp[1] = false;
        for (long i = 2; i < isp.length; i++) if (isp[(int)i]) for (long j = i * i; j <= n; j += i) isp[(int)j] = false;
        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        for (int i = 2; i < isp.length; i++) if (isp[i]) if (sum + i <= s) {sum += i;ans.add(i);}
        return ans;
    }
}