import java.util.*;
class stackAr{
    int elements[];
    int top;
    stackAr(int maxlength){top = maxlength;elements=new int[maxlength]; };
void push(int x){if(top==0)System.out.println("the Stack is Full");
else elements[--top]=x;}

Boolean isEmpty(){if(top==elements.length)return true;
else return false;}

void pop(){if(!isEmpty())top++;
else 
    System.out.println("Stack is Empty");
}
int Top(){if(!isEmpty())return elements[top];
else{System.out.println("Stack is Empty");
return -111;
}
}
void MakeNull(){top=elements.length;}}
class ArraylmpOfStack
{
    public static void main(String[] args) {
   stackAr s = new stackAr(20);
   s.push(1);
   s.push(9);
   s.push(2);
   s.push(10);
   
   while(!s.isEmpty())
   {System.out.println(s.Top());
   s.pop();
   }
    }
    
}
