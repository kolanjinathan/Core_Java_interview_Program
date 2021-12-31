package FactoryDesign_Patter;

public class Factory_Launch {
	public static void main(String[] args) {
		FactoryMethod_Currency india;
		try {
			india = Factory_Launch.getCurrencyFactory("IN");
			System.out.println(india.getCurrency());
			System.out.println(india.getSymbol());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param currency
	 * @return
	 * @throws Exception
	 */
	public static FactoryMethod_Currency getCurrencyFactory(String currency) throws Exception { 
		if ("IN".equalsIgnoreCase(currency)) {

			return new FactoryImple_India();
		}
		if ("USA".equalsIgnoreCase(currency)) {

			return new FactoryImpl_USA();
		}
		throw new Exception("Invalid Currency");

	}

}
