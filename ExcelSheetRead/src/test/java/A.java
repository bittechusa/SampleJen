//import org.testng.annotations.DataProvider;
//
//
//public class A 
//{
//	 @DataProvider(name="empLogin")
//
//	 public Object[][] loginData()
//
//	{
//
//	Object[][] arrayObject = getExcelData("C:\Users\bittech\Desktop\All Folders\MON\ExcelSheetRead\src\test\java\Book2.xlsx","Sheet1");
//
//	 return arrayObject;
//
//	}
//
//	 /** * @param File Name * @param Sheet Name * @return */
//
//	  public String[][] getExcelData(String fileName, String sheetName)
//
//	{
//
//	String[][] arrayExcelData = null;
//
//	 try {
//
//	FileInputStream fs = new FileInputStream(fileName);
//
//	Workbook wb = Workbook.getWorkbook(fs);
//
//	Sheet sh = wb.getSheet(sheetName);
//
//	 int totalNoOfCols = sh.getColumns();
//
//	 int totalNoOfRows = sh.getRows();
//
//	arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
//
//	 for (int i= 1 ; i < totalNoOfRows; i++)
//
//	{
//
//	 for (int j=0; j < totalNoOfCols; j++)
//
//	{
//
//	arrayExcelData[i-1][j] = sh.getCell(j, i).getContents(); } } }
//
//	 catch (FileNotFoundException e)
//
//	{
//
//	e.printStackTrace();
//
//	} catch (IOException e)
//
//	{
//
//	e.printStackTrace();
//
//	e.printStackTrace();
//
//	} catch (BiffException e)
//
//	{
//
//	e.printStackTrace();
//
//	}
//
//	 return arrayExcelData;
//
//	}
//
//}
