package Stack;

class StackArray {
    int[] arr;
    int size;
    int ptr;

    StackArray(int size){
        this.size = size;
        arr = new int[size];
        ptr = -1;
    }


    public void push(int data){
        if(ptr == size-1){
            System.out.println("Stack is full cannot insert");
        }
        ptr++;
        arr[ptr] = data;
    }

    public int pop(){
        if(ptr == -1){
            System.out.println("Stack is empty cannot pop the element");
            return -1;
        }
        return arr[ptr--];

    }

    public int peek(){
        if(ptr == -1){
            return -1;
        }

        return arr[ptr];
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public void display(){
        for (int i = ptr ; i >= 0 ;i--){
            System.out.print(arr[i] + " ");
        }
    }


}
