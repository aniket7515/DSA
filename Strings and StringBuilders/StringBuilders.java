package DSA.Strings;


public class StringBuilders {


    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);

        char ch=sb.charAt(0); // get
        System.out.println(ch);

        sb.setCharAt(0,'d');  // update
        System.out.println(sb);

        sb.insert(2,'y'); // insert
        System.out.println(sb);

        sb.deleteCharAt(2);  // remove
        System.out.println(sb);

        sb.append('g');  // add at last
        System.out.println(sb);

        System.out.println(sb.length()); // length

        int n=100000;
        long start= System.currentTimeMillis();
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(i);
        }

        long end=System.currentTimeMillis();
        long duration=end-start;
        System.out.println(duration);

    }
}
