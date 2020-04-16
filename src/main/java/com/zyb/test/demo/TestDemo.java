package com.zyb.test.demo;


import com.zyb.test.utils.BankCardUtil;

public class TestDemo {
    public static void main(String[] args){

        String bankCarkNo = "4613131513153131";
        boolean isBankCarkNo = BankCardUtil.checkString(bankCarkNo);
        if(!isBankCarkNo){
            System.out.println("银行卡卡号格式不正确");
        }
    }
}
