//package GFGSELFPACED.HASHING;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//public class ImplementationOfChaining {
//    public static void main(String[] args) {
//
//    }
//    class myHash{
//        int BUCKET;
//        ArrayList<LinkedList<Integer>> table;
//
//        myHash(int b) {
//            BUCKET=b;
//            table= new ArrayList<LinkedList<Integer>>();
//            for(int i=0;i<b;i++){
//                table.add(new LinkedList<Integer>());
//
//            }
//            void insert(int key){
//                int i=key%BUCKET;
//                table.get(i).add(key);
//            }
//            void remove( key){
//                int i=key%BUCKET;
//                table.get(i).remove((Integer) i);
//            }
//            boolean Search(key){
//                int i=key%BUCKET;
//                return table.get(i).contains(key);
//            }
//
//        }

//
//    }
//}
