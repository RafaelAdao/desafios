package euler.problems;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ProblemAnnotation
public interface Problem {
	
	String solve(List<String> input);

	default void run() throws IOException, URISyntaxException {
		String className = getClass().getSimpleName();

		URL url = System.class.getResource("/problemas/".concat(className));

		Path problemPath = Paths.get(url.toURI());

		try (Stream<Path> testPathsStream = Files.list(problemPath)) {
			List<Path> testPaths = testPathsStream
					.sorted()
					.collect(Collectors.toList());
			
			for (Path testPath : testPaths) {
				Path inputPath = Paths.get(testPath.toString(), "in.txt");

				Path outputPath = Paths.get(testPath.toString(), "out.txt");

				List<String> input = Files.readAllLines(inputPath, StandardCharsets.UTF_8);
				
				String expectedOutput = new String(Files.readAllBytes(outputPath), StandardCharsets.UTF_8).trim();
				
				String output = Optional.ofNullable(solve(input))
				        .map(String::trim)
				        .orElse("");
				
				StringBuilder sb = new StringBuilder();
				
				sb.append(getClass().getName()).append('.').append(testPath.getFileName()).append(": ");
				
				if (expectedOutput.equalsIgnoreCase(output)) {
					sb.append("PASSOU");
				} else {
					sb.append("FALHOU")
					    .append(System.lineSeparator())
					    .append("Valor esperado: ")
					    .append(System.lineSeparator())
						.append(expectedOutput)
						.append(System.lineSeparator())
						.append("Sua resposta: ")
						.append(System.lineSeparator())
						.append(output);
				}
				
				System.out.println(sb);
			}
		}
		
		System.out.println();
	}
}
