给定一个整数数组 A，我们只能用以下方法修改该数组：我们选择某个个索引 i 并将 A[i] 替换
为 -A[i]，然后总共重复这个过程 K 次。（我们可以多次选择同一个索引 i。）

以这种方式修改数组后，返回数组可能的最大和。

 

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/maximize-sum-of-array-after-k-negations
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            if(A[i]<0&&K!=0){
                A[i]=-A[i];
                K--;
            }
        }
        Arrays.sort(A);
        int sum=0;
        for(int i:A){
            sum+=i;
        }
        if(K%2==0){
            return sum;
        }
        return sum-2*A[0];
    }
}

