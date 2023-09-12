package main.medium;

import java.util.*;

/**
 * @author HJ
 * @date 2023/9/12 09:48
 * @description 433. 最小基因变化
 */
public class MinimumGeneticMutation {

    public int minMutation(String startGene, String endGene, String[] bank) {
        if(Objects.equals(startGene, endGene)){return 0;}
        if(bank.length==0){return -1;}
        ArrayList<String> list=new ArrayList<>();
        list.add(startGene);
        int[] def=new int[bank.length];
        int times=0;
        while(!list.isEmpty()){
            ++times;
            for(int i=0;i<list.size();++i){
                for(int j=0;j<bank.length;++j){
                    if(def[j]!=1&&des(list.get(0),bank[j])==1){
                        if(Objects.equals(endGene,bank[j])){
                            return times;
                        }else{
                            def[j]=1;
                            list.add(bank[j]);
                        }
                    }
                }
                list.remove(0);
            }
        }
        return -1;
    }
    private int des(String a,String b){
        int p=0;
        for(int i=0;i<8;++i){
            if(a.charAt(i)!=b.charAt(i)){
                ++p;
            }
        }
        return p;
    }

}
