/**
 * 
 */
package AdCo2024.Day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 */
public class MullItOver {
    public static String loadData() {
        //String filePath = "C:\\Users\\tomcl\\OneDrive\\Desktop\\AdventOfCode\\2024\\Day2\\RedNosedReport\\data\\testdata2";
        String filePath = "D:\\Projects\\EclipseProjects\\AdventOfCode\\Data\\MullItOverData";

        String data = new String();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                data = data + line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
        return data;
    }
	
	private static int multiplyStrings( String values) {
		String[] splitValues = values.split(",");
		try {
			return Integer.parseInt( splitValues[0] ) * Integer.parseInt( splitValues[1] );
		}
		catch (NumberFormatException e) {
			return 0;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test data answer: 161
		//String testString = "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))";
		// String testString = "!how()where()*mul(527,340)?why()^?mul(168,100)!^#mul(390,111)>'when()'select())((from()how()mul(412,526)/@what()";
		//String dataMemory = "!how()where()*mul(527,340)?why()^?mul(168,100)!^#mul(390,111)>'when()'select())((from()how()mul(412,526)/@what()from()when()-mul(500,980)#&[}]mul(887,503)%,$mul(699,805)what()select())>mul(292,305),'-{,@,how()who()mul(213,633)when()?@who()mul(652,4)*&'what()mul(177,237)&who()why()(@{+;why()<mul(23,321)what()when();from()-do()who() {&}-:(mul(844,162)~from()/mul(77,769)%,how()@%(?who()]<mul(694,833)^from()how()> &mul(193,679),)&mul(565,339)?}what()!who(){mul(705,313)mul(294,50)+mul(201,534) )~how()mul(659,49)!mul(871,788)select()where()from()mul(346,618) *&@'why()&}#mul(483,765)!#select()^*+[what()when()mul(448,525)]>:where()&^who()&mul(611,331):!)*/]}mul(37,42)>mul(538,106)when()why()mul(36,120)~where()-{+from()$'mul(950,456))mul(28,237)what()when(479,124)mul(697,976)):**/]&#how()#mul(424,841)why()'!;~mul(108,859)~%{?!mul(40,521)do()[^when()/%$+ [where()mul(187,953)who()where()select()(select()what()mul(984,77)<@)(/where()from()~;mul(163,398)/who()who()~mul(445,94))what()what()][how(),mul(115,245)--}/#how()what()!mul(366,981)'$why()do()what(565,96)who()mul(128,999):mul(858,772)[,,mul(796,864)why()what()^(mul(136,980)when()?!when()}mul(142,552)(mul(354,328)[(@how() (/~#mul(159,715)where()&mul(567,560)from()$^'$&&+!when()mul(582,489);where();select(),mul(306,841)? ,)how()mul(274,549)@~what()~?*mul(448,441);&<'select()when()when()#select()from()mul(404,209)^/ @who()who()'mul(400,15)';^&&when():{mul(199,543)[from()~+mul(452,787)([select()>/]$!/mul(840,165)when()>^why()~>when()(mul(830,125)from():mul(433,238);%why(){';$mul(494,781),-mul(139,401)&&&+who()>/^select()]do()mul(116,181)+$*[:who() do()how()<what()+mul(392,879)()what()don't()~)&?#*}mul(909,275)mul(695,234):],from()++^how()>;mul(514,117)$who()*)~%mul(859,857)}mul(837,844)>{@-what())-@@mul(574,73)]<[[why(608,495)how()who()when()mul(937,176)(%mul(471,325){'+)?:}mul(695,347)mul(56,888)where()##;#>who()+mul(157,650)mul(847,72):,[(how(144,703):mul(294,627)})>@mul(74,230)@)+what()mulhow()><<,$!(;why()mul(635,532)-select()mul(171,737)?select()[why()&^mul(587,686)$how()from())when()>;where()&mul(600,336)}@&{mul(651,690)from()?->&%mul(454,745)mul(387,378)mul(142,934)]mul(820,891)@#why()&how();;why()mul(337,723)&]from()when(894,39) ,>( mul/%(mul(271,558)#}']what()$-<^(mul(234 [what()when()select()($)+!don't()/ %<?%!]^mul(752,478)]how()mul(719,540)'when() why():(&'from(59,581)~mul(921,696)who()@,**%from(918,170))mul(224,391),where(104,159)do()from(339,837)}<<where()?{&how()mul(329,298)<who()what(937,474)&]@?mul(920,516);mul(438,991);{why()!]~'from()>mul(927,106)why()<%{{&~'<from()mul(950,746)'mul(240,649)?what(827,689)(mul(750,353)select(720,6)^mul(663,218)<,(why()<who()^>%why()mul(617?from()select()<what()mul(873,278)&^where(86,235)mul(170,108)!select()mul(66,5)@$^,~%from()mul(785,826): ~who(){mul(383,166):!![:~}+-'mul(554,291)@^)(^#when()when()why()mul(330,699)[:how(888,93)who()how(863,345)who()mul{how()-why()who()]$^mul(512,474)^@:mul(728,970)%mul(779,946)&& mul(216,667) where()^'%mul(788,642)how()>from()}$mul(915,977)& &mul(477,287){# mul(798,930)]mul(111select()*^@@/what()mul(518,86):('({&~{why()mul(991,855)*%^who()who()$/:{$mul(827,700)-'(mul(377,585)#&mul(171,537)when()@/>{< ,*:mul(349,478)!&^{-/mul(448,750)mul(868,546)mul(893,203)\r\n";

		String dataMemory = loadData();
		
		ArrayList<String> foundValues = new ArrayList<String>();
		int mulIndex = 0;
		int clParen = 0;
		
		while ( mulIndex != -1 ) {
			mulIndex = dataMemory.indexOf("mul(", mulIndex);
			if ( mulIndex != -1 ) {
				clParen = dataMemory.indexOf(")", mulIndex);
				if ( (clParen - (mulIndex + 4)) <= 7 ) {
					foundValues.add( dataMemory.substring(mulIndex + 4, clParen) );
					mulIndex = clParen;
					System.out.println(foundValues.getLast());
				}
				else {
					mulIndex = mulIndex + 1;
				}
			}
		}
	
		int total = 0;
		for (int i = 0; i < foundValues.size(); i++ ) {
			total = total + multiplyStrings( foundValues.get(i) );
		}
		
		System.out.println( "Total: " + total );
	}
}
