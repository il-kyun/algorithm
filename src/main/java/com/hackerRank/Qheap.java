package com.hackerRank;

import java.util.Scanner;

/**
 * Created by IK on 2017-07-15.
 */
public class Qheap {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Heap root = new Heap();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int op = scan.nextInt();
            if (op == 3) {
                int m = root.getMin();
                System.out.println(m);
            } else {
                int value = scan.nextInt();

                if (op == 1) {
                    root.add(value);
                }

                if (op == 2) {
                    root.delete(value);
                }
            }


        }
    }


}

class Heap {
    int value;
    Heap left;
    Heap right;

    public Heap() {

    }

    public Heap(int value) {
        this.value = value;
    }

    public void add(int value) {
        if (this.value == 0) {
            this.value = value;
            return;
        }

        if (this.value < value) {
            if (this.right == null) {
                this.right = new Heap(value);
            } else {
                this.right.add(value);
            }
        } else {
            if (this.left == null) {
                this.left = new Heap(value);
            } else {
                this.left.add(value);
            }
        }

    }

    public void delete(int value) {
        if (this.value < value) {
            if (this.right != null) {
                if (this.right.value == value) {
                    this.right = null;
                } else {
                    this.right.delete(value);
                }

            }
        } else if (this.value > value) {
            if (this.left != null) {
                if (this.left.value == value) {
                    this.left = null;
                } else {
                    this.left.delete(value);
                }
            }
        } else {
            if (right != null) {
                this.value = right.value;
                right = null;
            } else {
                this.value = 0;
            }

        }
    }

    public int getMin() {
        int min = this.value;

        if (left != null) {
            min = Math.min(min, left.getMin());
        }


        return min;
    }

}
