package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CoffeeMakerTest</code> contains tests for the class <code>{@link CoffeeMaker}</code>.
 *
 * @generatedBy CodePro at 3/20/18 2:46 PM
 * @author user
 * @version $Revision: 1.0 $
 */
public class CoffeeMakerTest {
	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */

	@Test
	public void testCoffeeMaker_1()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testCoffeeMaker_2()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}




	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testAddRecipe_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		
		Recipe r1 = new Recipe();
		r1.setName("first");
		r1.setPrice(10);
		r1.setAmtChocolate(2);
		r1.setAmtCoffee(2);
		r1.setAmtMilk(2);
		r1.setAmtSugar(2);
		
		Recipe r2 = new Recipe();
		r2.setName("second");
		r2.setPrice(10);
		r2.setAmtChocolate(2);
		r2.setAmtCoffee(2);
		r2.setAmtMilk(2);
		r2.setAmtSugar(2);
		
		Recipe r3 = new Recipe();
		r3.setName("third");
		r3.setPrice(10);
		r3.setAmtChocolate(2);
		r3.setAmtCoffee(2);
		r3.setAmtMilk(2);
		r3.setAmtSugar(2);
		
		Recipe r4 = new Recipe();
		r4.setName("four");
		r4.setPrice(10);
		r4.setAmtChocolate(2);
		r4.setAmtCoffee(2);
		r4.setAmtMilk(2);
		r4.setAmtSugar(2);
		
		Recipe r5 = new Recipe();
		r5.setName("five");
		r5.setPrice(10);
		r5.setAmtChocolate(2);
		r5.setAmtCoffee(2);
		r5.setAmtMilk(2);
		r5.setAmtSugar(2);
		
		boolean result1 = fixture.addRecipe(r1);
		boolean result2= fixture.addRecipe(r2);
		boolean result3 = fixture.addRecipe(r3);
		boolean result4 = fixture.addRecipe(r4);
		boolean result5 = fixture.addRecipe(r5);

		// add additional test code here
		assertEquals(true, result1);
		assertEquals(true, result2);
		assertEquals(true, result3);
		assertEquals(true, result4);
		assertEquals(false, result5);
		
		
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testAddRecipe_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();

		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testAddRecipe_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();

		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testAddRecipe_5() {
		CoffeeMaker fixture = new CoffeeMaker();
		
		Recipe r1 = new Recipe();
		r1.setName("first");
		r1.setPrice(10);
		r1.setAmtChocolate(2);
		r1.setAmtCoffee(2);
		r1.setAmtMilk(2);
		r1.setAmtSugar(2);
		
		Recipe r2 = new Recipe();
		r2.setName("first");
		r2.setPrice(10);
		r2.setAmtChocolate(2);
		r2.setAmtCoffee(2);
		r2.setAmtMilk(2);
		r2.setAmtSugar(2);
		
		fixture.addRecipe(r1);
		boolean result2= fixture.addRecipe(r2);

		// add additional test code here
		assertEquals(false, result2);

	}
	
	
	/**
	 * Run the Inventory checkInventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	
	@Test
	public void testCheckInventory_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();

		Inventory result = fixture.checkInventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getChocolate());
		assertEquals(15, result.getMilk());
	}
	
	@Test 
	public void testAddInventory_1()
	{
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = -1;
		int amtMilk = 1;
		int amtChocolate = 1;
		int amtSugar = 1;
		
		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtChocolate, 
				amtSugar);
		
		assertEquals(false, result);
	}

	@Test 
	public void testAddInventory_2()
	{
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtChocolate = 1;
		int amtSugar = 1;
		
		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtChocolate, 
				amtSugar);
		
		assertEquals(true, result);
	}
	
	@Test 
	public void testAddInventory_3()
	{
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = -1;
		int amtChocolate = 1;
		int amtSugar = 1;
		
		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtChocolate, 
				amtSugar);
		
		assertEquals(false, result);
	}
	
	@Test 
	public void testAddInventory_4()
	{
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtChocolate = -1;
		int amtSugar = 1;
		
		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtChocolate, 
				amtSugar);
		
		assertEquals(false, result);
	}
	
	@Test 
	public void testAddInventory_5()
	{
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtChocolate = 1;
		int amtSugar = -1;
		
		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtChocolate, 
				amtSugar);
		
		assertEquals(false, result);
	}
	
	@Test 
	public void testAddInventory_6()
	{
		
		CoffeeMaker fixture = new CoffeeMaker();
		
		int amtChocolate = 1;
		int amtCoffee = 2;
		int amtMilk = 3;
		int amtSugar = 4;
		
		fixture.addInventory(amtCoffee, amtMilk, amtSugar, 
				amtChocolate);
		
		Inventory i2 = fixture.checkInventory();
		assertEquals(17, i2.getCoffee() );
		assertEquals(16, i2.getChocolate() );
		assertEquals(19, i2.getSugar() );
		assertEquals(18, i2.getMilk() );
	}
	
	@Test 
	public void testAddInventory_7()
	{
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 0;
		int amtMilk = 0;
		int amtChocolate = 0;
		int amtSugar = 0;
		
		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtChocolate, 
				amtSugar);
		
		assertEquals(true, result);
	}
	
	
	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testDeleteRecipe_1()
		throws Exception {
CoffeeMaker fixture = new CoffeeMaker();
		
		Recipe r1 = new Recipe();
		r1.setName("first");
		r1.setPrice(10);
		r1.setAmtChocolate(2);
		r1.setAmtCoffee(2);
		r1.setAmtMilk(2);
		r1.setAmtSugar(2);
		
		Recipe r2 = new Recipe();
		r2.setName("second");
		r2.setPrice(10);
		r2.setAmtChocolate(2);
		r2.setAmtCoffee(2);
		r2.setAmtMilk(2);
		r2.setAmtSugar(2);
		
		fixture.addRecipe(r1);
		fixture.addRecipe(r2);
		boolean result1 = fixture.deleteRecipe(r2);

		// add additional test code here
		assertEquals(true, result1);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testDeleteRecipe_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testDeleteRecipe_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testDeleteRecipe_4()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = null;

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean doesntAlreadyExist(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testDoesntAlreadyExist_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();

		boolean result = fixture.doesntAlreadyExist(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean doesntAlreadyExist(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testDoesntAlreadyExist_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();

		boolean result = fixture.doesntAlreadyExist(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean doesntAlreadyExist(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testDoesntAlreadyExist_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();

		boolean result = fixture.doesntAlreadyExist(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testEditRecipe_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe oldRecipe = new Recipe();
		Recipe newRecipe = new Recipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testEditRecipe_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe oldRecipe = new Recipe();
		Recipe newRecipe = new Recipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testEditRecipe_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe oldRecipe = new Recipe();
		Recipe newRecipe = new Recipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testEditRecipe_4()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe oldRecipe = new Recipe();
		Recipe newRecipe = new Recipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testEditRecipe_5()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe oldRecipe = new Recipe();
		Recipe newRecipe = new Recipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	
	@Test
	public void testEditRecipe_6() {
		CoffeeMaker fixture = new CoffeeMaker();
		
		Recipe r2 = new Recipe();
		r2.setName("edit1");
		r2.setPrice(10);
		r2.setAmtChocolate(2);
		r2.setAmtCoffee(2);
		r2.setAmtMilk(2);
		r2.setAmtSugar(2);
		Recipe r1 = new Recipe();
		r1.setName("edit1");
		r1.setPrice(10);
		r1.setAmtChocolate(2);
		r1.setAmtCoffee(2);
		r1.setAmtMilk(2);
		r1.setAmtSugar(2);
		
		fixture.addRecipe(r1);
		boolean result1 = fixture.editRecipe(r1, r2);
		// add additional test code here
		assertEquals(true, result1);

	}

	@Test
	public void testGetRecipeForName_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtSugar());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testGetRecipeForName_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtSugar());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testGetRecipeForName_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtSugar());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testGetRecipeForName_4()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtSugar());
	}

	/**
	 * Run the Recipe[] getRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testGetRecipes_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();

		Recipe[] result = fixture.getRecipes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].toString());
		assertEquals(null, result[0].getName());
		assertEquals(0, result[0].getPrice());
		assertEquals(0, result[0].getAmtMilk());
		assertEquals(0, result[0].getAmtCoffee());
		assertEquals(0, result[0].getAmtChocolate());
		assertEquals(0, result[0].getAmtSugar());
		assertNotNull(result[1]);
		assertEquals(null, result[1].toString());
		assertEquals(null, result[1].getName());
		assertEquals(0, result[1].getPrice());
		assertEquals(0, result[1].getAmtMilk());
		assertEquals(0, result[1].getAmtCoffee());
		assertEquals(0, result[1].getAmtChocolate());
		assertEquals(0, result[1].getAmtSugar());
		assertNotNull(result[2]);
		assertEquals(null, result[2].toString());
		assertEquals(null, result[2].getName());
		assertEquals(0, result[2].getPrice());
		assertEquals(0, result[2].getAmtMilk());
		assertEquals(0, result[2].getAmtCoffee());
		assertEquals(0, result[2].getAmtChocolate());
		assertEquals(0, result[2].getAmtSugar());
		assertNotNull(result[3]);
		assertEquals(null, result[3].toString());
		assertEquals(null, result[3].getName());
		assertEquals(0, result[3].getPrice());
		assertEquals(0, result[3].getAmtMilk());
		assertEquals(0, result[3].getAmtCoffee());
		assertEquals(0, result[3].getAmtChocolate());
		assertEquals(0, result[3].getAmtSugar());
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testMakeCoffee_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtPaid = 20;
		
		Recipe r1 = new Recipe();
		r1.setName("edit1");
		r1.setPrice(10);
		r1.setAmtChocolate(2);
		r1.setAmtCoffee(2);
		r1.setAmtMilk(2);
		r1.setAmtSugar(2);

		int result = fixture.makeCoffee(r1, amtPaid);
		Inventory i1 = fixture.checkInventory();

		// add additional test code here
		System.out.println(result);
		System.out.println(i1.getCoffee());
		assertEquals(13, i1.getChocolate());
		assertEquals(13, i1.getCoffee());
		assertEquals(13, i1.getMilk());
		assertEquals(13, i1.getSugar());
		assertEquals(10, result);
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Test
	public void testMakeCoffee_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtPaid = 20;
		
		Recipe r1 = new Recipe();
		r1.setName("edit1");
		r1.setPrice(10);
		r1.setAmtChocolate(20);
		r1.setAmtCoffee(2);
		r1.setAmtMilk(2);
		r1.setAmtSugar(2);

		int result = fixture.makeCoffee(r1, amtPaid);
		Inventory i1 = fixture.checkInventory();

		// add additional test code here
		System.out.println(result);
		System.out.println(i1.getCoffee());
		assertEquals(15, i1.getChocolate());
		assertEquals(15, i1.getCoffee());
		assertEquals(15, i1.getMilk());
		assertEquals(15, i1.getSugar());
		assertEquals(20, result);
	}

	@Test
	public void testMakeCoffee_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtPaid = 20;
		
		Recipe r1 = new Recipe();
		r1.setName("edit1");
		r1.setPrice(21);
		r1.setAmtChocolate(20);
		r1.setAmtCoffee(2);
		r1.setAmtMilk(2);
		r1.setAmtSugar(2);

		int result = fixture.makeCoffee(r1, amtPaid);
		Inventory i1 = fixture.checkInventory();

		// add additional test code here
		System.out.println(result);
		System.out.println(i1.getCoffee());
		assertEquals(15, i1.getChocolate());
		assertEquals(15, i1.getCoffee());
		assertEquals(15, i1.getMilk());
		assertEquals(15, i1.getSugar());
		assertEquals(20, result);
	}
	
	@Test
	public void testMakeCoffee_4()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtPaid = 20;
		
		Recipe r1 = new Recipe();
		r1.setName("edit1");
		r1.setPrice(21);
		r1.setAmtChocolate(2);
		r1.setAmtCoffee(2);
		r1.setAmtMilk(2);
		r1.setAmtSugar(20);

		int result = fixture.makeCoffee(r1, amtPaid);
		Inventory i1 = fixture.checkInventory();

		// add additional test code here
		System.out.println(result);
		System.out.println(i1.getCoffee());
		assertEquals(15, i1.getChocolate());
		assertEquals(15, i1.getCoffee());
		assertEquals(15, i1.getMilk());
		assertEquals(15, i1.getSugar());
		assertEquals(20, result);
	}
	
	@Test
	public void testMakeCoffee_5()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtPaid = 20;
		
		Recipe r1 = new Recipe();
		r1.setName("edit1");
		r1.setPrice(21);
		r1.setAmtChocolate(2);
		r1.setAmtCoffee(2);
		r1.setAmtMilk(20);
		r1.setAmtSugar(2);

		int result = fixture.makeCoffee(r1, amtPaid);
		Inventory i1 = fixture.checkInventory();

		// add additional test code here
		System.out.println(result);
		System.out.println(i1.getCoffee());
		assertEquals(15, i1.getChocolate());
		assertEquals(15, i1.getCoffee());
		assertEquals(15, i1.getMilk());
		assertEquals(15, i1.getSugar());
		assertEquals(20, result);
	}
	
	@Test
	public void testMakeCoffee_6()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtPaid = 20;
		
		Recipe r1 = new Recipe();
		r1.setName("edit1");
		r1.setPrice(21);
		r1.setAmtChocolate(2);
		r1.setAmtCoffee(20);
		r1.setAmtMilk(2);
		r1.setAmtSugar(2);

		int result = fixture.makeCoffee(r1, amtPaid);
		Inventory i1 = fixture.checkInventory();

		// add additional test code here
		System.out.println(result);
		System.out.println(i1.getCoffee());
		assertEquals(15, i1.getChocolate());
		assertEquals(15, i1.getCoffee());
		assertEquals(15, i1.getMilk());
		assertEquals(15, i1.getSugar());
		assertEquals(20, result);
	}

	@Test
	public void testMakeCoffee_7()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtPaid = 20;
		
		Recipe r1 = new Recipe();
		r1.setName("edit1");
		r1.setPrice(20);
		r1.setAmtChocolate(2);
		r1.setAmtCoffee(2);
		r1.setAmtMilk(2);
		r1.setAmtSugar(2);
	
		int result = fixture.makeCoffee(r1, amtPaid);
		Inventory i1 = fixture.checkInventory();
	
		// add additional test code here
		System.out.println(result);
		System.out.println(i1.getCoffee());
		assertEquals(13, i1.getChocolate());
		assertEquals(13, i1.getCoffee());
		assertEquals(13, i1.getMilk());
		assertEquals(13, i1.getSugar());
		assertEquals(0, result);
	}
	
	
	@Test
	public void testRecipe_1()
		throws Exception {
		Recipe r = new Recipe();
		r.setPrice(0);
		r.setAmtChocolate(0);
		r.setAmtCoffee(0);
		r.setAmtMilk(0);
		r.setAmtSugar(0);
		assertEquals(0, r.getAmtChocolate());
		assertEquals(0, r.getAmtCoffee());
		assertEquals(0, r.getAmtSugar());
		assertEquals(0, r.getAmtMilk());
		assertEquals(0, r.getPrice());
	}
	
	@Test
	public void testInventory_1()
		throws Exception {
		Inventory i = new Inventory();
		
		assertEquals(i.getChocolate(), 15);
		assertEquals(i.getCoffee(), 15);
		assertEquals(i.getMilk(), 15);
		assertEquals(i.getSugar(), 15);
	}
	
	@Test
	public void testInventory_2()
		throws Exception {
		Inventory i = new Inventory();
		
		i.setChocolate(-1);
		i.setCoffee(-1);
		i.setMilk(-1);
		i.setSugar(-1);
		
		assertEquals(i.getChocolate(), -1);
		assertEquals(i.getCoffee(), -1);
		assertEquals(i.getMilk(), -1);
		assertEquals(i.getSugar(), -1);
	}
	
	@Test
	public void testInventory_3()
		throws Exception {
		Inventory i = new Inventory();
		i.setMilk(12);
		i.setChocolate(12);
		i.setCoffee(12);
		i.setSugar(12);
		
		assertEquals(i.getChocolate(), 12);
		assertEquals(i.getCoffee(), 12);
		assertEquals(i.getMilk(), 12);
		assertEquals(i.getSugar(), 12);
	}
	
	@Test
	public void testInventory_4()
		throws Exception {
		Inventory i = new Inventory();
		i.setMilk(0);
		i.setChocolate(0);
		i.setCoffee(0);
		i.setSugar(0);
		
		assertEquals(i.getChocolate(), 0);
		assertEquals(i.getCoffee(), 0);
		assertEquals(i.getMilk(), 0);
		assertEquals(i.getSugar(), 0);
	}
	
	@Test
	public void testInventory_5()
		throws Exception {
		Inventory i = new Inventory();
		
		CoffeeMaker fixture = new CoffeeMaker();
		int amtPaid = 20;
		
		Recipe r1 = new Recipe();
		r1.setName("edit1");
		r1.setPrice(5);
		r1.setAmtChocolate(15);
		r1.setAmtCoffee(15);
		r1.setAmtMilk(15);
		r1.setAmtSugar(15);

		int result = fixture.makeCoffee(r1, amtPaid);
		
		assertEquals(15, result);
	}
	
	
	
	
	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@Before
	public void setUp()
		throws Exception {
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CoffeeMakerTest.class);
	}
}