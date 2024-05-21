package com.codewithsuraj.test;

import com.codewithsuraj.model.Man;

/**
 * this is Test class where we are going to check the hashCode  values for different
 * objects
 */
public class Test {
    /**
     * this is main method
     * @param args
     */
    public static void main(String[] args) {
        //creating first object
        Man m1 = new Man(1, "suraj", "kirtipur");
        int hashcode1 = m1.hashCode();
        System.out.println("hashcode1::"+hashcode1);
        //this is second object But we are giving the reference of first object
        Man m2 = m1;
        int hashcode2 = m2.hashCode();
        System.out.println("hashcode2::"+hashcode2);

        Man m3=new Man(2, "hari", "kirtipur");
        int hashCode3=m3.hashCode();
        System.out.println("hashcode3::" +hashCode3);

        /**
         * string objects also override hashcode method
         */
        String str1=new String("suraj");
        int h1 =str1.hashCode();
        System.out.println("hashcode value os str1::"+h1);
        String str2=new String("sonu");
        int h2=str2.hashCode();
        System.out.println("hashcode value of str2::"+h2);


        /**
         * example for generating the hashcode but same
         * a two different objects also can have same hashcode it is possible
         * a good hashcode should return a distinct integer for each object as
         * much as possible
         */
       String str3="FB";
       String str4 ="Ea";
        System.out.println(str3.hashCode() +" ---- " +str4.hashCode());
        /**
         * whenever we call hashcode multiple times using same object
         * it always returns same value example
         */
        int v1=str1.hashCode();
        int v2=str1.hashCode();
        System.out.println(v1);
        System.out.println(v2);
        /**
         * when we press ctr +  click on hashcode method it will
         * forward us to string implementation of hashcode i.e
         */
//        public int hashCode() {
//            // The hash or hashIsZero fields are subject to a benign data race,
//            // making it crucial to ensure that any observable result of the
//            // calculation in this method stays correct under any possible read of
//            // these fields. Necessary restrictions to allow this to be correct
//            // without explicit memory fences or similar concurrency primitives is
//            // that we can ever only write to one of these two fields for a given
//            // String instance, and that the computation is idempotent and derived
//            // from immutable state
//            int h = hash;
//            if (h == 0 && !hashIsZero) {
//                h = isLatin1() ? StringLatin1.hashCode(value)
//                        : StringUTF16.hashCode(value);
//                if (h == 0) {
//                    hashIsZero = true;
//                } else {
//                    hash = h;
//                }
//            }
//            return h;
//        }

    }
}
