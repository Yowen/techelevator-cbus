package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		System.out.println("Number of birds left on the branch: " + remainingNumberOfBirds);

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println("Number of birds more than nests: " + numberOfExtraBirds);

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */

		int raccoonsInWoods = 3;
		int raccoonsThatWentHome = 2;
		int raccoonsLeftInWoods = raccoonsInWoods - raccoonsThatWentHome;
		System.out.println("Number of raccoons left in the woods: " + raccoonsLeftInWoods);
		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */

		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int beesLessThanFlowers = numberOfFlowers - numberOfBees;
		System.out.println("Number of bees without flowers: " + beesLessThanFlowers);
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		
		int lonelyPigeon = 1;
		int anotherPigeon = 1;
		int pigeonsEatingBreadcrumbs = lonelyPigeon + anotherPigeon;
		System.out.println("Number of pigeons eating breadcrumbs: " + pigeonsEatingBreadcrumbs);

        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int owlsSittingOnFence = 3;
		int owlsJoining = 2;
		int totalOwlsOnFence = owlsSittingOnFence + owlsJoining;
		System.out.println("Number of owls sitting on fence: " + totalOwlsOnFence);
		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int workingBeavers = 2;
		int beaversWentSwimming = 1;
		int beaversLeftWorking = workingBeavers - beaversWentSwimming;
		System.out.println("Number of beavers left working: " + beaversLeftWorking);
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int toucansOnTreeLimb = 2;
		int joiningToucans = 1;
		int totalToucansOnFence = toucansOnTreeLimb + joiningToucans;
		System.out.println("Total number of toucans sitting on the fence: " + totalToucansOnFence);
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */

		int squirrels = 4;
		int nuts = 2;
		int numberOfSquirrelsMoreThanNuts = squirrels - nuts;
		System.out.println("Number of squirrels more than nuts: " + numberOfSquirrelsMoreThanNuts);
		
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

		int quaters = 1;
		int centQuaters = quaters * 25;
		int dime = 1;
		int centDime = dime * 10;
		int nickels = 2;
		int centNickels = nickels * 2;
		int totalCents = centQuaters + centDime + centNickels;
		System.out.println("Total cents found by Mrs. Hilt: " + totalCents);
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int brier = 18;
		int macAdams = 20;
		int flannery = 17;
		int totalMuffins = brier + macAdams + flannery;
		System.out.println("Number of muffins baked: " + totalMuffins);
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		int yoyo = 24;
		int whistle = 14;
		int totalCost = yoyo + whistle;
		System.out.println("Total cost of the two toys: " + totalCost);
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;
		System.out.println("Total marshmallows: " + totalMarshmallows);
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int amountOfSnowAtHilt = 29;
		int snowAtSchool = 17;
		int snowDifference = amountOfSnowAtHilt - snowAtSchool;
		System.out.println("Amount of snow Mrs. Hilt had over the school: " + snowDifference);
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		int totalMoney = 10;
		int toyTruck = 3;
		int pencilCase = 2;
		int amountRemaining = totalMoney - toyTruck - pencilCase;
		System.out.println("Amount of money remaining: " + amountRemaining);
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int totalMarbles = 16;
		int marblesLost = 7;
		int marblesRemaining = totalMarbles - marblesLost;
		System.out.println("Marbles remaining: " + marblesRemaining);
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

		int currentSeashells = 19;
		int targetSeashells = 25;
		int seashellsNeeded = targetSeashells - currentSeashells;
		System.out.println("Number of seashells required to have 25 in collection: " + seashellsNeeded);
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int totalBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = totalBalloons - redBalloons;
		System.out.println("Number of green balloons:" + greenBalloons);
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int booksOnShelf = 38;
		int returnedBooks = 10;
		int totalBooks = booksOnShelf + returnedBooks;
		System.out.println("Number of books on the shelf: " + totalBooks);
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int singleBeeLegCount = 6;
		int beeCount = 8;
		int totalNumberOfLegs = singleBeeLegCount * beeCount;
		System.out.println("Total number of bee legs: " + totalNumberOfLegs);
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		int iceCreamConeCost = 99;
		int numberOfIceCreamCones = 2;
		int totalCostOfIceCreamCones = iceCreamConeCost * numberOfIceCreamCones;
		System.out.println("Total cost of ice cream cones: " + totalCostOfIceCreamCones);
		
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int currentRocks = 64;
		int rocksRequired = 125;
		int rocksDifference = rocksRequired - currentRocks;
		System.out.println("Number of rocks needed to complete the border: " + rocksDifference);
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int hiltMarbles = 38;
		int totalMarblesLost = 15;
		int hiltMarblesRemaining = hiltMarbles - totalMarblesLost;
		System.out.println("Number of marbles left for Mrs. Hilt: " + hiltMarblesRemaining);
		
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int totalMiles = 78;
		int milesDriven = 32;
		int totalMilesRemaining = totalMiles - milesDriven;
		System.out.println("Number of miles left to drive: " + totalMilesRemaining);
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */

		int timeSpentShovelingOnSaturday = 90;
		int timeSpentShovelingOnSunday = 45;
		int totalTimeSpentShoveling = timeSpentShovelingOnSaturday + timeSpentShovelingOnSunday;
		System.out.println("Total time spent shoveling: " + totalTimeSpentShoveling);
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		int numberOfHotDogs = 6;
		int costPerHotDog = 50;
		int totalCostOfHotDogs = numberOfHotDogs * costPerHotDog;
		System.out.println("Total cost of hot dogs: " + totalCostOfHotDogs);
		
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		int totalMoneyForPencils = 50;
		int pencilCost = 7;
		int numberOfPencilsBought = totalMoneyForPencils / pencilCost;
		System.out.println("Number of pencils bought: " + numberOfPencilsBought);
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

		int butterfliesSeen = 33;
		int orangeButterflies = 20;
		int redButterflies = butterfliesSeen - orangeButterflies;
		System.out.println("Number of red butterflies: " + redButterflies);
		
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		int moneyGiven = 100;
		int candyCost = 54;
		int change = moneyGiven - candyCost;
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int currentTreeCount = 13;
		int treesToPlant = 12;
		int totalNumberOfTrees = currentTreeCount + treesToPlant;
		System.out.println("Total number of trees: " + totalNumberOfTrees);
		
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

		int daysUntilVisit = 2;
		int hoursPerDay = 24;
		int totalHoursUntilVisit = daysUntilVisit * hoursPerDay;
		System.out.println("Hours until visit: " + totalHoursUntilVisit);
		
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

		int cousins = 4;
		int gumPerCousin = 5;
		int totalGumRequired = cousins * gumPerCousin;
		System.out.println("Total gum needed for all cousins: " + totalGumRequired);
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

		float currentMoney = 3.00f;
		float candyBar = 1.00f;
		float moneyRemainingFromPurchase = currentMoney - candyBar;
		System.out.println("Money leftover: " + moneyRemainingFromPurchase);
		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

		int boatsOnLake = 5;
		int peoplePerBoat = 3;
		int totalPeople = boatsOnLake * peoplePerBoat;
		System.out.println("Number of people on boats in the lake: " + totalPeople);
		
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		
		int legos = 380;
		int legosLost = 57;
		int legosRemaining = legos - legosLost;
		System.out.println("Legos remaining: " + legosRemaining);

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

		int muffinsBaked = 35;
		int totalMuffinsRequired = 83;
		int muffinsRequired = totalMuffinsRequired - muffinsBaked;
		System.out.println("Muffins left to bake: " + muffinsRequired) ;
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int willyCrayon = 1400;
		int lucyCrayon = 290;
		int crayonDifference = willyCrayon - lucyCrayon;
		System.out.println("Number of crayons Willy has over Lucy: " + crayonDifference);
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		
		int stickersOnPage = 10;
		int numberOfPages = 22;
		int totalStickers = stickersOnPage * numberOfPages;
		System.out.println("Total number of stickers: " + totalStickers);

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		
		int cupcakes = 96;
		int children = 8;
		int cupcakesPerChild = cupcakes / children;
		System.out.println("Number of whole cupcakes per child: " + cupcakesPerChild);

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		
		int gingerbreadCookies = 47;
		int cookiesPerJar = 6;
		int cookiesNotInJars = 47 % 6;
		System.out.println("Number of cookies not in jars: " + cookiesNotInJars);

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int croissants = 59;
		int neighbors = 8;
		int leftover = 59 % 8;
		System.out.println("Croissants left with Marian: " + leftover);
		
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

		int cookiesPerTray = 12;
		int totalCookies = 276;
		int numberOfTraysRequired = totalCookies / cookiesPerTray;
		System.out.println("Number of trays required: " + numberOfTraysRequired);
		
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

		int pretzels = 480;
		int servingSize = 12;
		int numberOfServingSize = pretzels / servingSize;
		System.out.println("Number of prepared serving size of Pretzel: " + numberOfServingSize);
		
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

		int lemonCupcakes = 53;
		int cupcakesForgotten = 2;
		int cupcakePerBox = 3;
		int cupcakesGiven = lemonCupcakes - cupcakesForgotten;
		int boxesGiven = cupcakesGiven / cupcakePerBox;
		System.out.println("Number of boxes with 3 lemon cupcakes given: " + boxesGiven);
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

		int preparedCarrotSticks = 74;
		int people = 12;
		int uneatenCarrotSticks = preparedCarrotSticks % people;
		System.out.println("Number of carrots left uneaten: " + uneatenCarrotSticks);
		
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

		int teddyBears = 98;
		int shelfLimit = 7;
		int shelvesFilled = teddyBears / shelfLimit;
		System.out.println("Number of shelves filled: " + shelvesFilled);
		
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		
		int picturesPerAlbum = 20;
		int totalPictures = 480;
		int albumsRequired = totalPictures / picturesPerAlbum;
		System.out.println("Total number of albums needed: " + albumsRequired);

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

		int tradingCards = 94;
		int cardsPerBox = 8;
		int filledBoxes = tradingCards / cardsPerBox;
		int unfilledBox = tradingCards % cardsPerBox;
		System.out.println("Boxes filled with cards: " + filledBoxes + ", Cards in unfilled box: " + unfilledBox);
		
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int totalNumberOfBooks = 210;
		int numberOfShelves = 10;
		int booksPerShelf = totalNumberOfBooks / numberOfShelves;
		System.out.println("Books per shelf: " + booksPerShelf);
		
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		int bakedCroissants = 17;
		int guests = 7;
		int croissantPerGuest = bakedCroissants / guests;
		System.out.println("Number of croissants per guest: " + croissantPerGuest);
		
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

		float billPaintSpeed = 1 / 2.15f;
		System.out.println("Bill paint speed per hour: " + billPaintSpeed);
		float jillPaintSpeed = 1 / 1.9f;
		System.out.println("Jill paint speed per hour: " + jillPaintSpeed);
		float combinedSpeed = billPaintSpeed + jillPaintSpeed;
		System.out.println("Combined paint speed: " + combinedSpeed);
		float workPerDay = combinedSpeed * 8;
		System.out.println("Work completed per day: " + workPerDay);
		float daysToComplete = 623 / workPerDay;
		System.out.println("Days to complete 623 rooms: " + daysToComplete);
		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

		String firstName = "Andrew";
		String lastName = "Huang";
		String middleInitial = "Y";
		String fullName = lastName + ", " + firstName + " " + middleInitial + ".";
		System.out.println(fullName);
		
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */

		float totalDistance = 800f;
		float distanceTraveled = 537f;
		float percentageComplete = distanceTraveled / totalDistance;
		int convertedValue = (int) (percentageComplete * 100);
		System.out.println("Percentage traveled: " + convertedValue);
	}

}
