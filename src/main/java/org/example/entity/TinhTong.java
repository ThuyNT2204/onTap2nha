package org.example.entity;

public class TinhTong {
    public int tinhTong(int n){
        if(n<1){
            return 0;
        }
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i % 2 !=0){
                sum+=i;
            }
        }
        return sum;
    }
}
