import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class create_student_bpp {

    public static void main (String[] args) throws InterruptedException, FileNotFoundException {

        //Clear Console
        System.setProperty("webdriver.chrome.silentOutput", "true");

        //Create an instance of webdriver (ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "C:"+ File.separator +"Users"+ File.separator +"admin"+ File.separator +"Google Drive"+ File.separator +"stuff"+ File.separator +"software"+ File.separator +"webdriver browsers" + File.separator + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // URL navigation
        driver.navigate().to("https://test.salesforce.com");

        // Salesforce portal login in
        driver.findElement(By.id("username")).sendKeys("crmteamfusion@noah_crm_bpp.com.noahqa");
        driver.findElement(By.id("password")).sendKeys("Fusion12345");
        driver.findElement(By.id("Login")).click();
        Thread.sleep(1000);


        //Loop
        boolean exitLoop = false;
        while (!exitLoop) {

            //Preparing random value for gender pick
            String [] equality = {"Male", "Female"};
            int random = new Random().nextInt(equality.length);

            //Giving a student randomized name based on a gender
            //Since string name were not readable if initialized in the of statement, had to initialize it before the statement itself
            String name;
            if (random == 1) {
                String [] namegen = {"Tora", "Temple", "Missy" ,"Kaye", "Luci", "Ethelene", "Kathlyn", "Willena", "Shirely", "Susanne", "Hillary", "Valerie", "Piedad", "Christie",
                        "Melda", "Bette", "Zelma", "Marla", "Dorla", "Alec", "Elanor", "Alex", "Olinda", "Alexis", "Marguerita", "Dulce", "Lashandra", "Mistie", "Nikia", "Roxie",
                        "Roxanna", "Deborah", "Joi", "Lorrine", "Jacqui", "Sage", "Alva", "Sherly", "Fidela", "Doretta", "Tresa", "Tobi", "Augusta", "Sherika", "Megan", "Andreas",
                        "Sima", "Sadie", "Oleta", "Angel", "Ora", "Gisela", "Dyan", "Hedwig", "Lajuana", "Mari", "Maria", "Sakura", "Shino", "Diana", "Oshino",
                        "Tena", "Fe", "Ariel", "Jolene", "Arlie", "Danika", "Consuelo", "Esperanza", "Sharleen", "Catherin", "Reba", "Danica", "Art", "Vi", "Bong", "Asa", "Ashley",
                        "Aubrey", "Krystyna", "Augustine", "Kirsten", "Eva", "Willena", "Avery", "Shea", "Ta", "Katharine", "Malika", "Eden", "Mozelle", "Beau", "Jana", "Charleen",
                        "Sigrid", "Annmarie", "Ann", "Briana", "Lue", "Robbyn", "Nidia", "Raisa", "Lavone", "Berry", "Phyllis", "Nichol", "Hildred", "Zelda", "Loralee", "Blaine",
                        "Blair", "Blake", "Bo", "Carmelia", "Shantae", "Naida", "Genoveva", "Jasmine", "Felicia", "Jenae", "Juliann", "Maura", "Sirena", "Deloris", "Francene", "Jane",
                        "Bettie", "Penny", "Lavonne", "Lucinda", "Rosanne", "Pei", "Cecelia", "Huong", "Yessenia", "Ronna", "Nguyet", "Terresa", "Melissia", "Donnette", "Stephaine",
                        "Ada", "Bryant", "Bryce", "Bryon", "Buck", "Bud", "Buddy", "Buford", "Burl", "Burt", "Burton", "Buster", "Byron", "Caleb", "Calvin", "Cameron", "Carey",
                        "Ai", "Aiko", "Akane", "Amane", "Anzu", "Miu", "Konomi", "Madoka", "Maaya", "Kawai", "Minae", "Megumi", "Mayumi", "Honoka", "Honami", "Chinatsu",
                        "Yui", "Rio", "Yuna", "Koharu", "Chance", "Hina", "Kokona", "Nanami", "Sara", "Risa", "Kanon", "Suzuki", "Saki", "Shiori", "Chi", "Natsuki",
                        "Chris", "Florrie", "Clarisa", "Mittie", "Monika", "Jone", "Clair", "Clarence", "Lucretia", "Irmgard", "Judy", "Lorean", "Tatiana", "Almeda", "Chery",
                        "Clementine", "Cleo", "Mayra", "Leeanne", "Meaghan", "Morrigan", "Mirian", "Phoebe", "Consuela", "Briana", "Cody", "Hyun", "Cole", "Maxine", "Colin", "Eunice",
                        "Gena", "Chasity", "Connie", "Deandra", "Edna", "Corey", "Scarlet", "Shavon", "Emilia", "Cory", "Shavon", "Patsy", "Missy", "Soraya", "Valentina",
                        "Simona", "Eleanore", "Arlena", "Esther", "Shaunte", "Kia", "Edwina", "Ferne", "Estela", "Danelle", "Alexa", "Alexstraza", "Denyse", "Dana", "Loise", "Leslee",
                        "Winona", "Dannie", "Danny", "Dante", "Jackqueline", "Margo", "Jennie", "Jacqui", "Irene", "Inga", "Kerri", "Cordie", "Elouise", "Dorie", "Tatum", "Devorah",
                        "April", "Kamilah", "Birgit", "Corina", "Linda", "Zana", "Tamatha", "Terina",  "Deandre", "Carlee", "Dee", "Del", "Ching", "Tona", "Lashanda", "Sue",
                        "Charolette", "Alysha", "Maryjane", "Wai", "Evelina", "Deon", "Leesa", "Oda", "Winter", "Summer", "Fall", "Brittney", "Zonia", "Keitha", "Glendora", "Kari",
                        "Mittie", "Gabriele", "Gabriella", "Gabi", "Olympia", "Athena", "Olga", "Lizbeth", "Liz", "Thi", "Maple", "Sadie", "Meg", "Kristyn", "Torie", "Giuseppina",
                        "Lorraine", "Donnie", "Mallie", "Zoe", "Trula", "Min", "Carita", "Erna", "Precious", "Elyse", "Elize", "Krysta", "Ameli", "Albertina", "Sally", "Hilma",
                        "Ma", "Lala", "Elsa", "Frida", "Brooke"};
                Random ran = new Random();
                name = namegen[ran.nextInt(namegen.length)];
            }
            else {
                String[] namegen = {"Aaron", "Abdul", "Abe" ,"Abel", "Abraham", "Abram", "Adalberto", "Adam", "Adan", "Adolfo", "Adolph", "Adrian", "Agustin", "Ahmad", "Ahmed", "Al",
                        "Alan", "Albert", "Alberto", "Alden", "Aldo", "Alec", "Alejandro", "Alex", "Alexander", "Alexis", "Alfonso", "Alfonzo", "Alfred", "Alfredo", "Ali", "Allan",
                        "Allen", "Alonso", "Alonzo", "Alphonse", "Alphonso", "Alton", "Alva", "Alvaro", "Alvin", "Amado", "Ambrose", "Amos", "Anderson", "Andre", "Andrea", "Andreas",
                        "Andres", "Andrew", "Andy", "Angel", "Angelo", "Anibal", "Anthony", "Antione", "Antoine", "Anton", "Antone", "Antonia", "Antonio", "Antony", "Antwan",
                        "Archie", "Arden", "Ariel", "Arlen", "Arlie", "Armand", "Armando", "Arnold", "Arnoldo", "Arnulfo", "Aron", "Arron", "Art", "Arthur", "Arturo", "Asa", "Ashley",
                        "Aubrey", "August", "Augustine", "Augustus", "Aurelio", "Austin", "Avery", "Barney", "Barrett", "Barry", "Bart", "Barton", "Basil", "Beau", "Ben", "Benedict",
                        "Benito", "Benjamin", "Bennett", "Bennie", "Benny", "Benton", "Bernard", "Bernardo", "Bernie", "Berry", "Bert", "Bertram", "Bill", "Billie", "Billy", "Blaine",
                        "Blair", "Blake", "Bo", "Bob", "Bobbie", "Bobby", "Booker", "Boris", "Boyce", "Boyd", "Brad", "Bradford", "Bradley", "Bradly", "Brady", "Brain", "Branden",
                        "Brandon", "Brant", "Brendan", "Brendon", "Brent", "Brenton", "Bret", "Brett", "Brian", "Brice", "Britt", "Brock", "Broderick", "Brooks", "Bruce", "Bruno",
                        "Bryan", "Bryant", "Bryce", "Bryon", "Buck", "Bud", "Buddy", "Buford", "Burl", "Burt", "Burton", "Buster", "Byron", "Caleb", "Calvin", "Cameron", "Carey",
                        "Carl", "Carlo", "Carlos", "Carlton", "Carmelo", "Carmen", "Carmine", "Carol", "Carrol", "Carroll", "Carson", "Carter", "Cary", "Casey", "Cecil", "Cedric",
                        "Cedrick", "Cesar", "Chad", "Chadwick", "Chance", "Chang", "Charles", "Charley", "Charlie", "Chas", "Chase", "Chauncey", "Chester", "Chet", "Chi", "Chong",
                        "Chris", "Christian", "Christoper", "Christopher", "Chuck", "Chung", "Clair", "Clarence", "Clark", "Claud", "Claude", "Claudio", "Clay", "Clayton", "Clement",
                        "Clemente", "Cleo", "Cletus", "Cleveland", "Cliff", "Clifford", "Clifton", "Clint", "Clinton", "Clyde", "Cody", "Colby", "Cole", "Coleman", "Colin", "Collin",
                        "Colton", "Columbus", "Connie", "Conrad", "Cordell", "Corey", "Cornelius", "Cornell", "Cortez", "Cory", "Courtney", "Coy", "Craig", "Cristobal", "Cristopher",
                        "Cruz", "Curt", "Curtis", "Cyril", "Cyrus", "Dale", "Dallas", "Dalton", "Damian", "Damien", "Damion", "Damon", "Dan", "Dana", "Dane", "Danial", "Daniel",
                        "Danilo", "Dannie", "Danny", "Dante", "Darell", "Daren", "Darin", "Dario", "Darius", "Darnell", "Daron", "Darrel", "Darrell", "Darren", "Darrick", "Darrin",
                        "Darron", "Darryl", "Darwin", "Daryl", "Dave", "David", "Davis", "Dean",  "Deandre", "Deangelo", "Dee", "Del", "Delbert", "Delmar", "Delmer", "Demarcus",
                        "Demetrius", "Denis", "Dennis", "Denny", "Denver", "Deon", "Derek", "Derick", "Derrick", "Deshawn", "Desmond", "Devin", "Devon", "Dewayne", "Dewey", "Dewitt",
                        "Dexter", "Dick", "Diego", "Dillon", "Dino", "Dion", "Dirk", "Domenic", "Domingo", "Dominic", "Dominick", "Dominique", "Don", "Donald", "Dong", "Donn",
                        "Donnell", "Donnie", "Donny", "Donovan", "Donte", "Dorian", "Dorsey", "Doug", "Douglas", "Douglass", "Doyle", "Drew", "Duane", "Dudley", "Duncan", "Dustin",
                        "Dusty", "Dwain", "Dwayne", "Dwight", "Dylan"};
                Random ran = new Random();
                name = namegen[ran.nextInt(namegen.length)];
            }

            //Surname Randomised
            String[] surnamegen = {"SMITH", "JOHNSON", "WILLIAMS", "BROWN", "JONES", "MILLER", "DAVIS", "GARCIA", "RODRIGUEZ", "WILSON", "MARTINEZ", "ANDERSON", "TAYLOR", "THOMAS",
                    "MOORE", "MARTIN", "JACKSON", "THOMPSON", "WHITE", "LOPEZ", "LEE", "GONZALEZ", "HARRIS", "CLARK", "LEWIS", "ROBINSON", "WALKER", "PEREZ", "HALL", "YOUNG", "HERNANDEZ",
                    "ALLEN", "SANCHEZ", "WRIGHT", "KING", "SCOTT", "GREEN", "BAKER", "ADAMS", "NELSON", "HILL", "RAMIREZ", "CAMPBELL", "MITCHELL", "ROBERTS", "CARTER", "PHILLIPS",
                    "EVANS", "TURNER", "TORRES", "PARKER", "COLLINS", "EDWARDS", "STEWART", "FLORES", "MORRIS", "NGUYEN", "MURPHY", "RIVERA", "COOK", "ROGERS", "MORGAN", "PETERSON",
                    "COOPER", "REED", "BAILEY", "BELL", "GOMEZ", "KELLY", "HOWARD", "WARD", "COX", "DIAZ", "RICHARDSON", "WOOD", "WATSON", "BROOKS", "BENNETT", "GRAY", "JAMES", "REYES",
                    "CRUZ", "HUGHES", "PRICE", "MYERS", "LONG", "FOSTER", "SANDERS", "ROSS", "MORALES", "POWELL", "SULLIVAN", "RUSSELL", "ORTIZ", "JENKINS", "GUTIERREZ", "PERRY", "BUTLER",
                    "BARNES", "FISHER", "HENDERSON", "COLEMAN", "SIMMONS", "PATTERSON", "REYNOLDS", "HAMILTON", "GRAHAM", "KIM", "GONZALES", "ALEXANDER", "RAMOS", "WALLACE", "GRIFFIN",
                    "WELLS", "ALVAREZ", "WOODS", "MENDOZA", "CASTILLO", "OLSON", "WEBB", "WASHINGTON", "TUCKER", "FREEMAN", "BURNS", "HENRY", "VASQUEZ", "SNYDER", "SIMPSON", "CRAWFORD",
                    "JIMENEZ", "PORTER", "MASON", "SHAW", "GORDON", "WAGNER", "HUNTER", "ROMERO", "HICKS", "DIXON", "HUNT", "PALMER", "ROBERTSON", "BLACK", "HOLMES", "STONE", "MEYER",
                    "BOYD", "MILLS", "WARREN", "FOX", "ROSE", "RICE", "MORENO", "SCHMIDT", "PATEL", "FERGUSON", "NICHOLS", "HERRERA", "MEDINA", "RYAN", "FERNANDEZ", "WEAVER", "DANIELS",
                    "BURKE", "GUZMAN", "MORRISON", "MUNOZ", "JACOBS", "OBRIEN", "LAWSON", "FRANKLIN", "LYNCH", "BISHOP", "CARR", "SALAZAR", "AUSTIN", "MENDEZ", "GILBERT", "JENSEN",
                    "WALTERS", "REID", "FIELDS", "WALSH", "LITTLE", "FOWLER", "BOWMAN", "DAVIDSON", "MAY", "DAY", "SCHNEIDER", "NEWMAN", "BREWER", "LUCAS", "HOLLAND", "WONG", "BANKS",
                    "SANTOS", "CURTIS", "PEARSON", "DELGADO", "VALDEZ", "PENA", "RIOS", "DOUGLAS", "SANDOVAL", "BARRETT", "HOPKINS", "KELLER", "GUERRERO", "STANLEY", "BATES", "ALVARADO",
                    "BECK", "ORTEGA", "WADE", "ESTRADA", "CONTRERAS", "BARNETT", "CALDWELL", "SANTIAGO", "LAMBERT", "POWERS", "CHAMBERS", "NUNEZ", "CRAIG", "LEONARD", "LOWE", "RHODES",
                    "BYRD", "GREGORY", "SHELTON", "FRAZIER", "BECKER", "MALDONADO", "FLEMING", "VEGA", "SUTTON", "COHEN", "JENNINGS", "PARKS", "MCDANIEL", "WATTS", "BARKER", "NORRIS",
                    "VAUGHN", "VAZQUEZ", "HOLT", "SCHWARTZ", "STEELE", "BENSON", "NEAL", "DOMINGUEZ", "HORTON", "TERRY", "WOLFE", "HALE", "LYONS", "GRAVES", "HAYNES", "MILES", "PARK",
                    "WARNER", "PADILLA", "BUSH", "THORNTON", "MCCARTHY", "MANN", "ZIMMERMAN", "ERICKSON", "FLETCHER", "MCKINNEY", "PAGE", "DAWSON", "JOSEPH", "MARQUEZ", "REEVES", "KLEIN",
                    "ESPINOZA", "BALDWIN", "MORAN", "LOVE", "ROBBINS", "HIGGINS", "BALL", "CORTEZ", "LE", "GRIFFITH", "BOWEN", "SHARP", "CUMMINGS", "RAMSEY", "HARDY", "SWANSON", "BARBER",
                    "ACOSTA", "LUNA", "CHANDLER", "DANIEL", "BLAIR", "CROSS", "SIMON", "DENNIS", "OCONNOR", "QUINN", "GROSS", "NAVARRO", "MOSS", "FITZGERALD", "DOYLE", "MCLAUGHLIN", "ROJAS",
                    "BLAKE", "MALONE", "WOLF", "HODGES", "JUAREZ", "GILL", "FARMER", "HINES", "GALLAGHER", "DURAN", "HUBBARD", "CANNON", "MIRANDA", "WANG", "SAUNDERS", "TATE", "MACK",
                    "HAMMOND", "CARRILLO", "TOWNSEND", "WISE", "INGRAM", "BARTON", "MEJIA", "AYALA", "SCHROEDER", "HAMPTON", "ROWE", "PARSONS", "FRANK", "WATERS", "STRICKLAND", "OSBORNE",
                    "MAXWELL", "CHAN", "DELEON", "NORMAN", "HARRINGTON", "CASEY", "PATTON", "LOGAN", "BOWERS", "MUELLER", "GLOVER", "FLOYD", "HARTMAN", "BUCHANAN", "COBB", "FRENCH", "KRAMER",
                    "YATES", "LINDSEY", "LLOYD", "MARSH", "MCBRIDE", "OWEN", "SOLIS", "PHAM", "LANG", "PRATT", "LARA", "BROCK", "BALLARD", "TRUJILLO", "SHAFFER", "DRAKE", "ROMAN", "AGUIRRE",
                    "VELASQUEZ", "MONTOYA", "ROTH", "MEYERS", "CARDENAS", "FUENTES", "WEISS", "WILKINS", "HOOVER", "NICHOLSON", "UNDERWOOD", "SHORT", "CARSON"};
            Random ran2 = new Random();
            String surname = surnamegen[ran2.nextInt(surnamegen.length)];

            //Modify for character length testing
            //name = "Tora Temple Missy Kaye Clarisa Alysha39";
            //String surname = "Tora Temple Missy Kaye Clarisa Alysha Mallie Gabriella Ol59";
            //String middlename = "Tora Temple Missy Kaye Clarisa Alysha Sallie GabriellaOly59";

            //Street Randomised
            String[] streetgen = {"Wall Street", "George Street", "College Street", "East Street", "William Street", "Chapel Street", "Woodland Street", "Henry Street", "Lake Street", "King Street"};
            Random ran3 = new Random();
            String Street = streetgen[ran3.nextInt(streetgen.length)];

            // Tab navigation "+" => "Accounts"
            driver.findElement(By.className("allTabsArrow")).click();
            driver.findElement(By.xpath("//div[3]/div[2]/table/tbody/tr[1]/td[1]/a")).click();
            driver.findElement(By.xpath("//table/tbody/tr/td[2]/input")).click();
            driver.findElement(By.xpath("//*[@id='bottomButtonRow']/input[1]")).click();

            // Randomised - phone number
            Random randNum = new Random(System.currentTimeMillis());
            int num = randNum.nextInt(1000000000);

            // Randomised - street number 1
            Random rNum = new Random(System.currentTimeMillis());
            int num2 = rNum.nextInt(1000);

            // Randomised - street number 2
            Random ryNum = new Random(System.currentTimeMillis());
            int num3 = ryNum.nextInt(200);

            // Randomised - postal code
            Random rynNum = new Random(System.currentTimeMillis());
            int num4 = rynNum.nextInt(6000);

            // Student Account Edit - New Account page
            driver.findElement(By.xpath("//*[@id='name_firstacc2']")).sendKeys(name);
            driver.findElement(By.xpath("//*[@id='name_lastacc2']")).sendKeys(surname);
            //driver.findElement(By.id("00Nb0000003v7kX")).sendKeys(middlename);

            Select Student_Type = new Select(driver.findElement(By.xpath("//*[@id='00Nb0000003v7lc']")));
            Student_Type.selectByVisibleText("Domestic");

            driver.findElement(By.xpath("//*[@id='PersonBirthdate']")).sendKeys("02/02/1990");

            //Modified to pick a random gender. Fighting for equality!
            Select Gender = new Select(driver.findElement(By.xpath("//*[@id='00Nb0000003v7kV']")));
            Gender.selectByVisibleText(equality[random]);

            Select Phone = new Select(driver.findElement(By.xpath("//*[@id='00Nb0000003v7kg']")));
            Phone.selectByVisibleText("Home");
            driver.findElement(By.xpath("//*[@id='PersonHomePhone']")).sendKeys(num +"158");

            Select Email = new Select(driver.findElement(By.xpath("//*[@id='00Nb0000003v7ke']")));
            Email.selectByVisibleText("Work");
            driver.findElement(By.xpath("//*[@id='00Nb0000003v7ko']")).sendKeys(name + "-" + surname + "@mailinator.com");
            //driver.findElement(By.xpath("//*[@id='00Nb0000003v7ko']")).sendKeys( "longnamecheck@mailinator.com");

            Select Legal_Entity = new Select(driver.findElement(By.xpath("//*[@id='00Nb0000004LziE']")));
            Legal_Entity.selectByVisibleText("UC~COL");

            driver.findElement(By.xpath("//*[@id='bottomButtonRow']/input[1]")).click();
            Thread.sleep(1000);

            // Address navigation
            WebElement element = driver.findElement(By.xpath(".//input[@value='New Address']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(1000);
            element.click();


            // Address Edit - New Address page
            Select Address_Type = new Select(driver.findElement(By.xpath("//*[@id='00Nb0000004Lzeo']")));
            Address_Type.selectByVisibleText("Billing");

            driver.findElement(By.xpath("//*[@id='00Nb0000004Lzed']")).click();
            driver.findElement(By.xpath("//*[@id='00Nb0000004Lzef']")).sendKeys(Street + ' ' + num2 + "/" + num3);
            driver.findElement(By.xpath("//*[@id='00Nb0000004LzeZ']")).sendKeys("London");
            driver.findElement(By.xpath("//*[@id='00Nb0000004Lzep']")).sendKeys("PC-" + num4);
            driver.findElement(By.xpath("//*[@id='CF00Nb0000004Lzec']")).sendKeys("United Kingdom");
            driver.findElement(By.xpath("//*[@id='bottomButtonRow']/input[1]")).click();
            driver.findElement(By.partialLinkText(name)).click();

            // Get Profile ID
            Thread.sleep(3000);
            driver.findElement(By.partialLinkText(name)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='topButtonRow']/input[7]")).click();
            Thread.sleep(5000);

            // Opportunity navigation
            //driver.findElement(By.name("newOpp")).click();;

            WebElement opportunity_focus = driver.findElement(By.name("newOpp"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", opportunity_focus);
            Thread.sleep(1000);
            opportunity_focus.click();

            driver.findElement(By.xpath("//*[@id='bottomButtonRow']/input[1]")).click();

            // Opportunity Edit - New Opportunity page
            driver.findElement(By.xpath("//*[@id='opp3']")).sendKeys(name + surname);

            Select Status = new Select(driver.findElement(By.xpath("//*[@id='opp11']")));
            Status.selectByVisibleText("Accepted - Conditional Firm");

            Select Customer_Group = new Select(driver.findElement(By.xpath("//*[@id='00Ng0000001MZHo']")));
            Customer_Group.selectByVisibleText("SELFFUND");

            //driver.findElement(By.xpath("//*[@id='ep']/div[2]/div[9]/table/tbody/tr[2]/td[4]/div/span/span/a")).click();

            WebElement close_date_focus = driver.findElement(By.xpath("//*[@id='ep']/div[2]/div[9]/table/tbody/tr[2]/td[4]/div/span/span/a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", close_date_focus);
            Thread.sleep(1000);
            close_date_focus.click();

            Select Sponsorship_level = new Select(driver.findElement(By.xpath("//*[@id='00Nb0000009XrE0']")));
            Sponsorship_level.selectByVisibleText("None");

            //driver.findElement(By.xpath("//*[@id='bottomButtonRow']/input[1]")).click();

            WebElement save_opportunity_focus = driver.findElement(By.xpath("//*[@id='bottomButtonRow']/input[1]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", save_opportunity_focus);
            Thread.sleep(1000);
            save_opportunity_focus.click();

            // Product Catalog Item navigation
            //driver.findElement(By.name("new00Nb0000009YxlB")).click();

            WebElement product_catalog_focus = driver.findElement(By.name("new00Nb0000009YxlB"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", product_catalog_focus);
            Thread.sleep(1000);
            product_catalog_focus.click();

            //Product Catalog Item - Offering Selection page
            driver.findElement(By.xpath("//*[@id='j_id0:searchForm:searchPageBlock:OfferingLookup']")).sendKeys("2320020");
            //driver.findElement(By.xpath("//*[@id='j_id0:searchForm:searchPageBlock:OfferingLookup']")).sendKeys("2320292");
            //This particular product item is created to prevent the creation of SO at AR. Use it to test "Regenerate Sales Order" functionality
            //driver.findElement(By.xpath("//*[@id='j_id0:searchForm:searchPageBlock:OfferingLookup']")).sendKeys("2380060");
            driver.findElement(By.xpath("//*[@id='j_id0:searchForm:searchPageBlock:sBtn']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//td[@id='j_id0:searchForm:searchPageBlock:offeringTable:0:j_id43']/input")).click();
            Thread.sleep(6000);

            //driver.findElement(By.name("j_id0:searchForm:j_id77:j_id78:bottom:j_id79")).click();

            WebElement add_product_focus = driver.findElement(By.name("j_id0:searchForm:j_id77:j_id78:bottom:j_id79"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", add_product_focus);
            Thread.sleep(1000);
            add_product_focus.click();

            //Printout
            System.out.printf("%-15s\t %-15s\t %-15s\n", name + " " + surname, driver.getCurrentUrl(), driver.findElement(By.id("00Nb0000003v7lg_ileinner")).getText());
            //driver.close();
        }
    }
}
