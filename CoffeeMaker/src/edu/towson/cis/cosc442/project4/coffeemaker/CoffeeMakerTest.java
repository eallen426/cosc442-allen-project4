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
	//tests to make sure a CoffeeMaker object exists when created
	@Test
	public void testCoffeeMaker_1()
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
	//Tests to make sure when attempting to add a recipe when recipe
	//list is full, the recipe is not added
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
	//Tests that a recipe is added to the list when addRecipe method is 
	//used
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
	//Tests that a recipe is not added when an identical recipe
	//already exists in the list
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
	//Tests that an inventory is instantiated with the correct values
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
	
	//test that an inventory item set as a negative integer will not 
	//result in the inventory being updated
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

	//test that an inventory item set as a negative integer will not 
		//result in the inventory being updated
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
	
	//test that an inventory item set as a negative integer will not 
		//result in the inventory being updated
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
	
	//test that an inventory item set as a negative integer will not 
		//result in the inventory being updated
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
	
	//test that an inventory item set as a negative integer will not 
		//result in the inventory being updated
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
	
	//checks to make sure an Inventory is updated correctly through 
	//a CoffeeMaker object
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
	
	//tests to make sure an inventory is updated even when passed all
	//zero values when using addInventory
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
	//tests to make sure a recipe is correctly deleted
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
	//Tests to make sure a recipe that is not added to the CoffeeMaker
	//can not be deleted
	@Test
	public void testDeleteRecipe_2()
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
		boolean result = fixture.deleteRecipe(r2);
		assertEquals(false, result);
	}


	/**
	 * Run the boolean doesntAlreadyExist(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	//tests that when a recipe doesn't exist, method doesntAlreadyExist
	//returns true when passed the recipe
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
	//tests that the method doesntAlreadyExist returns false when
		//the recipe it is passed already exists in the CoffeeMaker
	@Test
	public void testDoesntAlreadyExist_2()
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
		
		boolean result = fixture.doesntAlreadyExist(r2);
		assertEquals(false, result);

	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	//tests that two identical recipes cannot be added
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
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	//tests that the editRecipe method works
	@Test
	public void testEditRecipe_2() {
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
	
	//tests that when passed a recipe name, getRecipeForName returns
	//the recipe with that name
	@Test
	public void testGetRecipeForName_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		
		Recipe r1 = new Recipe();
		r1.setName("first");
		r1.setPrice(10);
		r1.setAmtChocolate(2);
		r1.setAmtCoffee(2);
		r1.setAmtMilk(2);
		r1.setAmtSugar(2);
		fixture.addRecipe(r1);
		
		Recipe result = fixture.getRecipeForName("first");
		assertEquals(r1, result);

	}

	/**
	 * Run the Recipe[] getRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/20/18 2:46 PM
	 */
	//makes sure getRecipes method returns all recipes in the CoffeeMaker
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
	//Tests that makeCoffee updates the inventory correctly and returns
	//the change correctly
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
	//tests that a coffee is not made when there is not enough inventory
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
	
	//tests that a coffee is not made when insufficient funds are entered
	@Test
	public void testMakeCoffee_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtPaid = 20;
		
		Recipe r1 = new Recipe();
		r1.setName("edit1");
		r1.setPrice(21);
		r1.setAmtChocolate(2);
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
	
	//tests that a coffee is not made when there is not enough inventory
	@Test
	public void testMakeCoffee_4()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtPaid = 20;
		
		Recipe r1 = new Recipe();
		r1.setName("edit1");
		r1.setPrice(2);
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
	
	//tests that a coffee is not made when there is not enough inventory
	@Test
	public void testMakeCoffee_5()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtPaid = 20;
		
		Recipe r1 = new Recipe();
		r1.setName("edit1");
		r1.setPrice(2);
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
	
	//tests that a coffee is not made when there is not enough inventory
	@Test
	public void testMakeCoffee_6()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtPaid = 20;
		
		Recipe r1 = new Recipe();
		r1.setName("edit1");
		r1.setPrice(2);
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
	
	//tests that the setter methods for the Recipe class work correctly
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
	
	//makes sure recipe amounts default to -1 when a negative integer
	//is entered
	@Test
	public void testRecipe_2()
		throws Exception {
		Recipe r = new Recipe();
		r.setPrice(-1);
		r.setAmtChocolate(-1);
		r.setAmtCoffee(-1);
		r.setAmtMilk(-1);
		r.setAmtSugar(-1);
		assertEquals(-1, r.getAmtChocolate());
		assertEquals(-1, r.getAmtCoffee());
		assertEquals(-1, r.getAmtSugar());
		assertEquals(-1, r.getAmtMilk());
		assertEquals(-1, r.getPrice());
	}
	
	//tests that a newly made inventory defaults all amounts to 15
	@Test
	public void testInventory_1()
		throws Exception {
		Inventory i = new Inventory();
		
		assertEquals(i.getChocolate(), 15);
		assertEquals(i.getCoffee(), 15);
		assertEquals(i.getMilk(), 15);
		assertEquals(i.getSugar(), 15);
	}
	
	//tests that when setting an inventories amounts to negative values,
	//they default to -1
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
	
	//tests to make sure the Inventory setter methods function correctly
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
	
	//tests to make sure that adding zero amounts to an inventory still
	//updates the inventory
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