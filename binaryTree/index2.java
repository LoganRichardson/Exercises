package binaryTree;

public class index2 {
    class Node{
        Node leftChild;
        Node rightChild;
        
        String name;
        int key;
        
        public Node(String name, int key){
            this.name = name;
            this.key = key;
        }
        
        public String toString(){
            return name + " with a key " + key;
        }
    }
    
    Node root;
    
    public void addNode(String name, int key){
        Node newNode = new Node(name, key);
        if(root == null){
            root = newNode;
        }else{
            Node focusNode = root;
            Node parent;
            while(true){
                parent = focusNode;
                if(key < focusNode.key){
                    focusNode = focusNode.leftChild;
                    if(focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }
                if(key > focusNode.key){
                    focusNode = focusNode.rightChild;
                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
        
    }
}
