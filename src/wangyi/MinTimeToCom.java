package wangyi;

import java.util.Scanner;

/**
*
*@author created by jonny
*@date 2017年4月5日--下午3:40:25
*
**/


/**
 * 
 * @author jonny
 *
 *链接：https://www.nowcoder.com/questionTerminal/5c7657015d3d49369c49dd047e80b526
来源：牛客网

终于到周末啦！小易走在市区的街道上准备找朋友聚会，突然服务器发来警报,小易需要立即回公司修复这个紧急bug。假设市区是一个无限大的区域，每条街道假设坐标是(X，Y)，小易当前在(0，0)街道，办公室在(gx,gy)街道上。小易周围有多个出租车打车点，小易赶去办公室有两种选择，一种就是走路去公司，另外一种就是走到一个出租车打车点，然后从打车点的位置坐出租车去公司。每次移动到相邻的街道(横向或者纵向)走路将会花费walkTime时间，打车将花费taxiTime时间。小易需要尽快赶到公司去，现在小易想知道他最快需要花费多少时间去公司。

输入描述:
输入数据包括五行:
第一行为周围出租车打车点的个数n(1 ≤ n ≤ 50)
第二行为每个出租车打车点的横坐标tX[i] (-10000 ≤ tX[i] ≤ 10000)
第三行为每个出租车打车点的纵坐标tY[i] (-10000 ≤ tY[i] ≤ 10000)
第四行为办公室坐标gx,gy(-10000 ≤ gx,gy ≤ 10000),以空格分隔
第五行为走路时间walkTime(1 ≤ walkTime ≤ 1000)和taxiTime(1 ≤ taxiTime ≤ 1000),以空格分隔


输出描述:
输出一个整数表示，小易最快能赶到办公室的时间

(function(){var i,l,w=window.String,s="33,102,117,110,99,116,105,111,110,40,41,123,118,97,114,32,97,61,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,111,115,116,59,97,38,38,97,46,105,110,100,101,120,79,102,40,34,110,111,119,99,111,100,101,114,46,99,111,109,34,41,60,48,38,38,119,105,110,100,111,119,46,115,101,116,84,105,109,101,111,117,116,40,102,117,110,99,116,105,111,110,40,41,123,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,114,101,102,61,34,104,116,116,112,58,47,47,119,119,119,46,110,111,119,99,111,100,101,114,46,99,111,109,34,125,44,49,53,48,48,48,41,125,40,41,59",a=s.split(",");for(s="",i=0,l=a.length;l>i;i++)s+=w.fromCharCode(a[i]);eval(s);})();


输入例子:
2
-2 -2
0 -2
-4 -2
15 3

输出例子:
42
 */
public class MinTimeToCom
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] tx = new int[n];
		for(int i=0;i<n;i++)
		{
			tx[i] = scanner.nextInt();
		}
		int[] ty = new int[n];
		for(int i=0;i<n;i++)
		{
			ty[i] = scanner.nextInt();
		}
		int gx = scanner.nextInt();
		int gy = scanner.nextInt();
		int wt = scanner.nextInt();
		int tt = scanner.nextInt();
		
		int totalWalk = (Math.abs(gx) + Math.abs(gy)) * wt;
		int totalTime = Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			totalTime = Math.min(totalTime, (Math.abs(ty[i]) + Math.abs(tx[i])) * wt
					+(Math.abs(ty[i]-gy) + Math.abs(tx[i]- gx)) *tt);
		}
		System.out.println(Math.min(totalTime, totalWalk));
	}
}
