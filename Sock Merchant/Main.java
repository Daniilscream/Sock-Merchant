
        static int sockMerchant(int n, int[] ar) {
            int res = 0;
            Arrays.sort(ar);
            for (int i = 0; i <ar.length; i++) {
                for (int k = i+1; k <ar.length ; k++) {
                    if(ar[i]==ar[k]){
                        res++;
                        i=k+1;
                        k++;
                    }
                }
            }
            return res;

        }





