import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class create_faculty_bpp {

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
        driver.findElement(By.id("username")).sendKeys("apolloit.offshoreadmin@gmail.com.bpp.qa.noah");
        driver.findElement(By.id("password")).sendKeys("Fusion12345");
        driver.findElement(By.id("Login")).click();
        Thread.sleep(1000);


        //Loop
        boolean exitLoop = false;
        while (!exitLoop) {

            //Giving faculty a random first name
            String[] namegen = {"AARON", "ABDUL", "ABE" ,"ABEL", "ABRAHAM", "ABRAM", "ADALBERTO", "ADAM", "ADAN", "ADOLFO", "ADOLPH", "ADRIAN", "AGUSTIN", "AHMAD", "AHMED", "AL",
                    "ALAN", "ALBERT", "ALBERTO", "ALDEN", "ALDO", "ALEC", "ALEJANDRO", "ALEX", "ALEXANDER", "ALEXIS", "ALFONSO", "ALFONZO", "ALFRED", "ALFREDO", "ALI", "ALLAN",
                    "ALLEN", "ALONSO", "ALONZO", "ALPHONSE", "ALPHONSO", "ALTON", "ALVA", "ALVARO", "ALVIN", "AMADO", "AMBROSE", "AMOS", "ANDERSON", "ANDRE", "ANDREA", "ANDREAS",
                    "ANDRES", "ANDREW", "ANDY", "ANGEL", "ANGELO", "ANIBAL", "ANTHONY", "ANTIONE", "ANTOINE", "ANTON", "ANTONE", "ANTONIA", "ANTONIO", "ANTONY", "ANTWAN",
                    "ARCHIE", "ARDEN", "ARIEL", "ARLEN", "ARLIE", "ARMAND", "ARMANDO", "ARNOLD", "ARNOLDO", "ARNULFO", "ARON", "ARRON", "ART", "ARTHUR", "ARTURO", "ASA", "ASHLEY",
                    "AUBREY", "AUGUST", "AUGUSTINE", "AUGUSTUS", "AURELIO", "AUSTIN", "AVERY", "BARNEY", "BARRETT", "BARRY", "BART", "BARTON", "BASIL", "BEAU", "BEN", "BENEDICT",
                    "BENITO", "BENJAMIN", "BENNETT", "BENNIE", "BENNY", "BENTON", "BERNARD", "BERNARDO", "BERNIE", "BERRY", "BERT", "BERTRAM", "BILL", "BILLIE", "BILLY", "BLAINE",
                    "BLAIR", "BLAKE", "BO", "BOB", "BOBBIE", "BOBBY", "BOOKER", "BORIS", "BOYCE", "BOYD", "BRAD", "BRADFORD", "BRADLEY", "BRADLY", "BRADY", "BRAIN", "BRANDEN",
                    "BRANDON", "BRANT", "BRENDAN", "BRENDON", "BRENT", "BRENTON", "BRET", "BRETT", "BRIAN", "BRICE", "BRITT", "BROCK", "BRODERICK", "BROOKS", "BRUCE", "BRUNO",
                    "BRYAN", "BRYANT", "BRYCE", "BRYON", "BUCK", "ANZU", "MIU", "KONOMI", "MADOKA", "MAAYA", "KAWAI", "MINAE", "MEGUMI", "MAYUMI", "HONOKA", "HONAMI", "CHINATSU",
                    "YUI", "RIO", "YUNA", "KOHARU", "CHANCE", "HINA", "KOKONA", "NANAMI", "SARA", "RISA", "KANON", "SUZUKI", "SAKI", "SHIORI", "CHI", "NATSUKI",
                    "CHRIS", "FLORRIE", "CLARISA", "MITTIE", "MONIKA", "JONE", "CLAIR", "CLARENCE", "LUCRETIA", "IRMGARD", "JUDY", "LOREAN", "TATIANA", "ALMEDA", "CHERY",
                    "CLEMENTINE", "CLEO", "MAYRA", "LEEANNE", "MEAGHAN", "MORRIGAN", "MIRIAN", "PHOEBE", "CONSUELA", "BRIANA", "CODY", "HYUN", "COLE", "MAXINE", "COLIN", "EUNICE",
                    "GENA", "CHASITY", "CONNIE", "DEANDRA", "EDNA", "COREY", "SCARLET", "SHAVON", "EMILIA", "CORY", "SHAVON", "PATSY", "MISSY", "SORAYA", "VALENTINA",
                    "SIMONA", "ELEANORE", "ARLENA", "ESTHER", "SHAUNTE", "KIA", "EDWINA", "FERNE", "ESTELA", "DANELLE", "ALEXA", "ALEXSTRAZA", "DENYSE", "DANA", "LOISE", "LESLEE",
                    "WINONA", "DANNIE", "DANNY", "DANTE", "JACKQUELINE", "MARGO", "JENNIE", "JACQUI", "IRENE", "INGA", "KERRI", "CORDIE", "ELOUISE", "DORIE", "TATUM", "DEVORAH",
                    "APRIL", "KAMILAH", "BIRGIT", "CORINA", "LINDA", "ZANA", "TAMATHA", "TERINA",  "DEANDRE", "CARLEE", "DEE", "DEL", "CHING", "TONA", "LASHANDA", "SUE",
                    "CHAROLETTE", "ALYSHA", "MARYJANE", "WAI", "EVELINA", "DEON", "LEESA", "ODA", "WINTER", "SUMMER", "FALL", "BRITTNEY", "ZONIA", "KEITHA", "GLENDORA", "KARI",
                    "MITTIE", "GABRIELE", "GABRIELLA", "GABI", "OLYMPIA", "ATHENA", "OLGA", "LIZBETH", "LIZ", "THI", "MAPLE", "SADIE", "MEG", "KRISTYN", "TORIE", "GIUSEPPINA",
                    "LORRAINE", "DONNIE", "MALLIE", "ZOE", "TRULA", "MIN", "CARITA", "ERNA", "PRECIOUS", "ELYSE", "ELIZE", "KRYSTA", "AMELI", "ALBERTINA", "SALLY", "HILMA",
                    "MA", "LALA", "ELSA", "FRIDA", "BROOKE"};
            Random ran = new Random();
            String firstname = namegen[ran.nextInt(namegen.length)];

            //Giving faculty a random last name
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
            String lastname = surnamegen[ran2.nextInt(surnamegen.length)];

            //Randomizing a street
            String[] streetgen = {"Wall Street", "George Street", "College Street", "East Street", "William Street", "Chapel Street", "Woodland Street", "Henry Street", "Lake Street", "King Street"};
            Random ran3 = new Random();
            String Street = streetgen[ran3.nextInt(streetgen.length)];

            // Navigating to Faculty tab

            ((JavascriptExecutor)driver).executeScript("scroll(0,0)");

            driver.findElement(By.className("allTabsArrow")).click();
            driver.findElement(By.linkText("Faculties")).click();
            driver.findElement(By.xpath("//*[@id='hotlist']/table/tbody/tr/td[2]/input")).click();
            driver.findElement(By.xpath("//*[@id='bottomButtonRow']/input[1]")).click();

            // Randomizing a Phone number
            Random randNum = new Random(System.currentTimeMillis());
            int num = randNum.nextInt(1000000000);

            // Randomizing a Street 1
            Random rNum = new Random(System.currentTimeMillis());
            int num2 = rNum.nextInt(1000);

            // Randomizing a Street 2
            Random ryNum = new Random(System.currentTimeMillis());
            int num3 = ryNum.nextInt(200);

            // Randomizing a Street 3
            Random rynNum = new Random(System.currentTimeMillis());
            int num4 = rynNum.nextInt(6000);

            // Entering previously randomized First & Last name
            driver.findElement(By.xpath("//*[@id='00Nb0000004Lzg8']")).sendKeys(firstname);
            driver.findElement(By.xpath("//*[@id='00Nb0000004LzgA']")).sendKeys(lastname);

            //Entering a Birth Date
            driver.findElement(By.xpath("//*[@id='00Nb0000004Lzg6']")).sendKeys("02/02/1990");

            //Entering a Phone Number
            driver.findElement(By.xpath("//*[@id='00Nb0000004LzgE']")).sendKeys(num +"158");

            //Entering an E-mail
            driver.findElement(By.xpath("//*[@id='00Nb0000004Lzg7']")).sendKeys(firstname + "-" + lastname + "@mailinator.com");

            //Entering a Street
            driver.findElement(By.xpath("//*[@id='00Nb0000004LzgK']")).sendKeys(Street + ' ' + num2 + "/" + num3);
            driver.findElement(By.xpath("//*[@id='00Nb0000004Lzg3']")).sendKeys("London");
            driver.findElement(By.xpath("//*[@id='00Nb0000004LzgF']")).sendKeys("PC-" + num4);
            driver.findElement(By.xpath("//*[@id='CF00Nb0000004Lzg4']")).sendKeys("United Kingdom");

            WebElement save_faculty = driver.findElement(By.xpath(".//*[@title='Save']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", save_faculty);
            Thread.sleep(1000);
            save_faculty.click();

            WebElement submit_faculty = driver.findElement(By.xpath(".//*[@title='Submit Faculty']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit_faculty);
            Thread.sleep(1000);
            submit_faculty.click();

            //Printout
            System.out.printf("%-15s\t %-15s\n", firstname + " " + lastname, driver.getCurrentUrl());

            //driver.close();
        }
    }
}
