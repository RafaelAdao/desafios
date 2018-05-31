package euler;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;

import euler.problems.Problem;
import euler.problems.ProblemAnnotation;

public class Main {

	public static void main(String[] args) throws Exception {
		Reflections reflections = new Reflections("euler.problems", new TypeAnnotationsScanner(),
				new SubTypesScanner(false));
	
		List<Constructor<?>> constructors = reflections.getTypesAnnotatedWith(ProblemAnnotation.class)
				.stream()
				.sorted((a, b) -> a.getName().compareTo(b.getName()))
				.map(Class::getConstructors)
				.map(Arrays::asList)
				.flatMap(List::stream)
				.filter(constructor -> constructor.getParameterCount() == 0)
				.collect(Collectors.toList());
				
		for (Constructor<?> constructor : constructors) {
			Problem problem = (Problem) constructor.newInstance();
			problem.run();
		}
	}
}
