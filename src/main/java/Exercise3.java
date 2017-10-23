public class Exercise3{

    public static void main(String[] args){
        int num = parse(args);
        if(num == -1){
            System.exit(1);
        }
        int tri = triN(num);
        int lazy = lazyN(num);
        if(tri ==  -1 || lazy == 1){
            System.exit(1);
        }
        else{
            System.out.println("Tri(n) = " + tri);
            System.out.println("Lazy(n) = " + lazy);
        }
    }

    public static int triN(int n){
        if(n<0){
            return -1;
        }
        if(n == 0){
            return 0;
        }
        else{
            int sum = 0;
            try{
                for(int i=1; i<=n; i++){
                    sum += i;
                }
                return sum;
            }
            catch(Exception ex){
                return -1;
            }
        }

    }

    public static int lazyN(int n){
        if(n<0){
            return -1;
        }
        if(n == 0){
            return 1;
        }
        else{
            try{
                int result = (n*n + n + 1)/2;
                return result;
            }
            catch(Exception ex){
                return -1;
            }
        }
    }

    public static int parse(String[] s){
        if(s.length != 1 || s == null){
            return -1;
        }
        else{
            try{
                int temp = Integer.parseInt(s[0]);
                if(temp < 0){
                    return -1;
                }
                else{
                    return temp;
                }
            }
            catch(Exception ex){
                return -1;
            }
        }
    }
}