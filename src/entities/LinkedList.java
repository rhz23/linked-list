package entities;

public class LinkedList<T> {

    Node<T> refNodeIn;

    public LinkedList(){
        this.refNodeIn = null;
    }

    public boolean isEmpty() {
        return refNodeIn == null ? true : false;
    }

    public int size() {
        int listSize = 0;

        Node<T> auxRef = refNodeIn;
        while(true){
            if(auxRef != null){
                listSize++;
                if(auxRef.getNextNode() != null){
                    auxRef = auxRef.getNextNode();
                }else{
                    break;
                }
            }else{
             break;
            }
        }
        return listSize;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if(this.isEmpty()){
            refNodeIn = newNode;
            return;
        }else{
            Node<T> auxNode = refNodeIn;
            for(int i = 0; i<this.size()-1; i++){
                auxNode = auxNode.getNextNode();
            }
            auxNode.setNextNode(newNode);
        }
    }

    public Node<T> getNode(int index){
        indexValidation(index);
        Node<T> auxNode = refNodeIn;
        Node<T> returnNode = null;

        for(int i = 0; i    <= index; i++){
            returnNode = auxNode;
            auxNode = auxNode.getNextNode();
        }
        return returnNode;
    }

    public T get(int index){
        return getNode(index).getData();
    }

    public T remove(int index){
        Node<T> auxNode = this.getNode(index);
        if(index == 0){
            refNodeIn = auxNode.getNextNode();
            return auxNode.getData();
        }else{
            Node<T> previosNode = getNode(index-1);
            previosNode.setNextNode(auxNode.getNextNode());
            return auxNode.getData();
        }
    }

    private void indexValidation(int index){
        int lastIndex = size()-1;
        if(index >= size()){
            throw new IndexOutOfBoundsException("There's no data on index " + index +  "of this list. The last index in this list is: " + lastIndex);
        }
    }

    @Override
    public String toString() {
        String returnStr = "";
        Node<T> auxNode = refNodeIn;
        for(int i = 0; i<this.size(); i++){
            returnStr += "[Node{" + "data=" + auxNode.getData() + "}]--->";
            auxNode = auxNode.getNextNode();
        }
        returnStr += "null";

        return returnStr;
    }
}
