import java.util.*;

public class BitWise{
	static final int VISIBLE=1;
	static final int DRAGGABLE=2;
	static final int SELECTABLE=4;
	static final int EDITABLE=8;

	public static void main(String[] args){
		int flags=0;
		flags=flags|VISIBLE;
		flags=flags|DRAGGABLE;

		if((flags&VISIBLE)==VISIBLE){
			if((flags&DRAGGABLE)==DRAGGABLE){
				System.out.println("Flags are both visible and draggable.");
			}
		}
		
		flags=flags|EDITABLE;

		if((flags & EDITABLE) == EDITABLE){
			System.out.println("Flags are now also editable."); 
		}
	}
}

/**STATIC KEYWORD:
  *A variable which is declared static(in a class) holds common value for all objects of the class.
  *Usually, the memory for an instance variable(of an object) is allocated when the object is created.
  *However, the memory for a static variable is allocated only once when the class is loaded. This saves a lot of memory.
  *FINAL KEYWORD:
  *A variable which is declared final holds a constant value which cannot be changed.
  *EXPLANATION OF PROGRAM:
  *Here, instead of declaring 4 separate boolean flags, we use only one integer variable for flag in which each bit represents one flag.
  *We use bitwise operations to set and reset flags and check whether a flag is set.
  *VISIBLE=0001
  *DRAGGABLE=0010
  *SELECTABLE=0100
  *EDITABLE=1000
