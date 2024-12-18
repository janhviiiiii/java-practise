package calculator;

public class Calculator {

	private double[] arr = new double[5];
	private int size = 0; // to track the no of elements in array

	public double[] getArr() {
		return arr;
	}

	public void addNumbers(double... numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (size == arr.length) {
				arr = newArray(arr); // increasing array size
			}
			arr[size++] = numbers[i];
		}
	}

	private double[] newArray(double[] oldArray) {
		double[] newArray = new double[oldArray.length + 5];
		for (int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}

		return newArray;
	}

	public void setArr(double[] arr) {
		this.arr = arr;
	}

	public double add() {
		double result = 0;
		for (int i = 0; i < size; i++) {
			result += arr[i];
		}
		return result;
	}

	public double subtract() {
		if(size==0) return 0;
		double result = arr[0];
		for (int i = 1; i < size; i++) { 
			result -= arr[i];
		}
		return result;
	}

	public double multiply() {
		if(size==0) return -1;
		double result = 1;
		for (int i = 0; i < size; i++) {
			result *= arr[i];
		}
		return result;
	}

	public void reset() {
		arr = new double[5]; //reset array
		size = 0; //reset size
	}

}
