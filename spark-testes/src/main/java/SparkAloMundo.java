
import java.util.Arrays;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.VoidFunction;


public class SparkAloMundo {

	public static void main(String[] args) {
		SparkConf conf = new SparkConf().setAppName("SparkAloMundo").setMaster("local");
		JavaSparkContext context = new JavaSparkContext(conf);
		
		List<String> lista = Arrays.asList(new String[] {"Nivaldo", "Caio", "Victorio"});
		
		JavaRDD<String> rdd = context.parallelize(lista);
		rdd.foreach(new VoidFunction<String>() {
			public void call (String t) throws Exception {
				System.out.println(t);
			}
		});
	}

}
