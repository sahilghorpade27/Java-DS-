public class removeduplicates {

    public static void removeDup(String str , int i , StringBuilder sb , boolean map[]){
        if(i == str.length()){
            System.out.println(sb);
            return;
        }

        char currchar = str.charAt(i);
        if(map[currchar - 'a'] == true){  // Corrected condition
            removeDup(str, i + 1, sb, map);
        }
        else{
            map[currchar - 'a'] = true;
            removeDup(str, i + 1, sb.append(currchar), map);
        }
    }

    public static void main(String[] args) {
        String str = "apppnaacolllegee";
        removeDup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
