package library.unitestvsexceptionhandling.example3;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class FixThisSoln {
private final static Logger LOG = Logger.getLogger(FixThisSoln.class.getName());
	List<String> processList(List<String> list)  {

	    return list.stream()
	    		   .map(x -> {
					   try {
						   return doNothingIfShort(x);
					   } catch (InputTooLongException e) {
						   LOG.warning(e.getMessage());

						   return x.substring(0, 3);
					   }
				   })
	               .collect(Collectors.toList());

/*
	    return  list.stream()
				.map(x -> unchecked((String s) -> doNothingIfShort(s)).apply(x))
				.collect(Collectors.toList());*/
	}

	 
	String doNothingIfShort(String input) throws InputTooLongException {
	    if (input.length() > 3)
	    	throw new InputTooLongException();
	    else
	    	return input;
	}
	
	public static void main(String[] args) {
		FixThisSoln ft = new FixThisSoln();
		List<String> words1 = Arrays.asList("not1", "too", "big", "yet");

		System.out.println(ft.processList(words1));
	}
	
	class InputTooLongException extends Exception {
		private static final long serialVersionUID = 1L;

		public InputTooLongException() {
			super("Must be length 3 or less");
		}

		public InputTooLongException(String s) {
			super(s);
		}

		public InputTooLongException(Throwable t) {
			super(t);
		}
	}
}
