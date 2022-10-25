package O1_easy.day_01;


public class O5_DefiningIpAddress_1108 {
    public static void main(String[] args) {
        Solution_1108 solution_1108 = new Solution_1108();
        System.out.println(solution_1108.defangIPaddr("1.1.1.1"));
    }
}
class Solution_1108 {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}