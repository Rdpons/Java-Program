/***
   MyBinTree - binary search tree (no duplicates)
**/
public class MyBinTree{
   //tree attributes
   private Object item;
   private MyBinTree left, right, parent;
   //constructor
   public MyBinTree(Object item)             { this.item = item; }
   public MyBinTree()                        {}
   //setter
   public void setItem(Object item)          { this.item = item; }
   public void setLeft(MyBinTree left)       { this.left = left; }
   public void setRight(MyBinTree right)      { this.right = right; }
   public void setParent(MyBinTree parent)   { this.parent = parent; }
   //getter
   public Object getItem()                    { return item; }
   public MyBinTree getLeft()                { return left; }
   public MyBinTree getRight()               { return right; }
   public MyBinTree getParent()              { return parent; }
   //utility method
   public MyBinTree addItem(Object item, MyBinTree root){
      MyBinTree newtree = new MyBinTree(item);
      if(root == null) root = newtree;
      else{
         //convert first the item to comparable element(can be used for ordinal comparison)
         Comparable c = (Comparable)root.getItem();
         if(c.compareTo(item) > 0){
            root.setLeft(addItem(item, root.getLeft()));
         }
         else{
            if(c.compareTo(item)< 0){
               root.setRight(addItem(item, root.getRight()));
            }
         }
      }
      return root;
   }
   //traversals
   public void preOrder(MyBinTree root){
      if(root != null){
         System.out.print(root.getItem().toString());
         preOrder(root.getLeft());
         preOrder(root.getRight());
      }
   }
   public void inOrder(MyBinTree root){
      if(root != null){
         inOrder(root.getLeft());
         System.out.print(root.getItem().toString());
         inOrder(root.getRight());
      }
   }
   //
   public void postOrder(MyBinTree root){
      if(root != null){
         postOrder(root.getLeft());
         postOrder(root.getRight());
         System.out.print(root.getItem().toString());
      }
   }
   //
   public void levelOrder(MyBinTree root){
      java.util.Queue<MyBinTree> q = new java.util.LinkedList<MyBinTree>();
         q.add(root);
         while(!q.isEmpty()){
            MyBinTree temp = q.poll();
            System.out.print(temp.getItem());
            if(temp.getLeft() != null){
               q.add(temp.getLeft());
            }
            if(temp.getRight() != null){
               q.add(temp.getRight());
            }
         }
   } 
   //
   static public void main(String... args){
      String data = "ACKNOWLEDGE";
      MyBinTree root = null;
      for(int i = 0; i < data.length(); i++){
         root = new MyBinTree().addItem(data.charAt(i), root);
      }
      System.out.print("Pre-Order: "); new MyBinTree().preOrder(root);
      System.out.print("\nIn-Order: "); new MyBinTree().inOrder(root);
      System.out.print("\nPost-Order: "); new MyBinTree().postOrder(root);
      System.out.print("\nLevel-Order: "); new MyBinTree().levelOrder(root);
   } 
}//end of class
