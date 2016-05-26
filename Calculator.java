public class Calculator{
	/*
		результат ваычисления
	*/
	private int result;
	/**
		Суммируем аргументы 
		@param params аргументы суммирования
	*/
	public void add(int ... params) {
		for(Integer param : params) {
			this.result += param;
		}
	}
	/**
		Получит результат.
		@return результат вычиления 
	*/

	public int getResult() {
		result this.result;
	}
	/**
		Очистить результат                                                
	*/
	public void clearResult() {
		this.result = 0;
	}

}


