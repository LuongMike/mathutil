package com.giaolang.util.mathutil.core;

public class MathUtility {
    //class này dùng cung cấp các hàm tính toán toán học
    //bắt chước class math trong jdk
    //vì những tính toán ny, tính xong thả ra, ko cần lưu trữ lại
    //do đó ta thiết kế nó dạng static

    //ta làm hàm tính N! = 1.2.3.4....n
    //quy ước
    //ko có giai thừa số âm -5! ko hơp lệ
    //20! vừa đủ kiểu long 21! ko dùng long đc
    //0!=1 của bên toàn học
    public static long getFactorial(int n){
        if (n < 0 || n > 20){
            throw new IllegalArgumentException("n must be between 0 and 20");
            //nếu đưa data 0 < và > 20 ko chạy
        }
        if (n == 0){
            return 1;
        }
        //cpu chạy đến đây tức là  n = 1,2,3,.....,20
        //tính n! =1,2,3,... thuật toán con heo đất, ốc bưu nhồi thịt, nhân dồn, cộng dồn tích lũy
        long result = 1 ;
        for (int i = 1; i <= n ; i++) {
            result *= i; //i = 1 nhân 1, i=2 nhân 2,...
                         //đang có bao nhiêu nhân tiếp
        }
        return result;
    }
}
