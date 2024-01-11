package j.y2024.jan.test;

public class OtherSolution {
    private boolean compareAndMakeString(int i, int j, String[] arr){

        if(i == j){
            return true;
        }
        StringBuilder strB = new StringBuilder();
        // 3 cases
        // i is smaller -> append 0th char of i+1 and match
        if(arr[i].length() < arr[j].length()){
            strB.append(arr[i]).append(arr[i + 1].charAt(0));
            if(compareString(strB.toString(), arr[j])){
                updateStrings(arr, i, i+1, true);
            }
            return true;
        }else if(arr[j].length() < arr[i].length()){
            // j is smaller -> append last char of j -1 and match
            strB.append(arr[j-1].charAt(arr[j-1].length() - 1)).append(arr[j]);
            if(compareString(arr[i], strB.toString())){
                updateStrings(arr, j, j-1, false);
                return true;
            }
        }else{
            // i and j both are equal -> if both are unequal -> append i+1 and j-1 and rematch
            if(compareString(arr[i], arr[j])){
                return true;
            }else{
                strB.append(arr[i]).append(arr[i+1].charAt(0));
                StringBuilder strB2 = new StringBuilder();
                strB2.append(arr[j-1].charAt(arr[j-1].length() - 1)).append(arr[j]);
                if(compareString(strB.toString(), strB2.toString())){
                    updateStrings(arr, i, i+1, true);
                    updateStrings(arr, j, j-1, false);
                    return true;
                }
            }
        }




        return false;
    }

    private void updateStrings(String[] arr, int srcIdx, int destIdx, boolean isAppend){
        if(isAppend){
            arr[srcIdx] = arr[srcIdx] + arr[destIdx].charAt(0);
            arr[destIdx] = arr[destIdx].substring(1);
        }else{
            arr[srcIdx] = arr[destIdx].charAt((arr[destIdx].length() - 1)) + arr[srcIdx];
            arr[destIdx] = arr[destIdx].substring(0, (arr[destIdx].length() - 1));
        }
    }

    private boolean compareString(String str1, String str2){
        return str1.equals(str2);
    }


    public boolean makePalindrome(String[] arr){

        int i = 0;
        int j = arr.length - 1;

        while(i <= j){
            if(!compareAndMakeString(i, j, arr)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
