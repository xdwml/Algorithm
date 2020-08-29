package Tree;

import java.util.Arrays;

public class ZJ23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null||sequence.length<=0) return false;//鲁棒性
        int root=sequence[sequence.length-1];
        //在二叉搜索树中左子树的节点小于根节点
        int cut=0;
        for(int i=0;i<sequence.length-1;i++){
            if (sequence[i]>root){
                cut=i+1;
                break;
            }
        }
        if(cut==0)
            VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0 ,sequence.length-1));
        else {
            for(int i=cut;i<sequence.length-1;i++)
            {
                if(sequence[i]<=root)
                    return false;
            }
            VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0 ,cut));
            VerifySquenceOfBST(Arrays.copyOfRange(sequence, cut,sequence.length-1));

        }
        return true;
    }
}
