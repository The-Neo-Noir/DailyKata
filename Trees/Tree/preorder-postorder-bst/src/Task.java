import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int i = 0;
            while (n-- > 0) {
                arr[i++] = sc.nextInt();
            }
            TreeNode node = buildTree(arr, 0, arr.length - 1);
            postorder(node);
            System.out.println();
        }
    }

    private static void postorder(TreeNode n) {
        if (n != null) {
            postorder(n.left);
            postorder(n.right);
            System.out.print(n.val + " ");
        }
    }

    private static TreeNode buildTree(int a[], int lowIndex, int highIndex) {
        TreeNode node = null;
        if (lowIndex <= highIndex) {
            node = new TreeNode(a[lowIndex]);
            int leftHigh = lowIndex + 1;
            for (int i = lowIndex + 1; i <= highIndex; i++) {
                if (a[i] > node.val) {
                    leftHigh = i;
                    break;
                }
            }
            node.left = buildTree(a, lowIndex + 1, leftHigh - 1);
            node.right = buildTree(a, leftHigh, highIndex);
            return node;
        } else {
            return node;
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

}