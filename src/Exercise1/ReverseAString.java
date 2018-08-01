package Exercise1;

public class ReverseAString {

	public static void main(String[] args) {
		/**
		 * @param args
		 */
		
			String input = "The cat jumped over the fence";

			// converting the string to bytes
			byte[] inputByteArray = input.getBytes();

			byte[] output = new byte[inputByteArray.length];

			// Storing the bytes in reverse order into output array
			for (int i = 0; i < inputByteArray.length; i++)
				output[i] = inputByteArray[inputByteArray.length - i - 1];

			System.out.println(new String(output));
		}

	}


