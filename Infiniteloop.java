public class InfiniteLoop {

    /**
     * System.out.println utility method
     *
     * @param value : value to print
     */
    static void print(String value) {
        System.out.println(value);
    }


    /**
     * main method for this class
     */
    public static void main(String[] args) {

        while(true){
            print("[Maulik, Harsh, Krishna, Technocredits] value is: Krishna, [Maulik, Harsh, Technocredits, Krishna] value is: Technocredits...");
        }

    }
}