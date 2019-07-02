package tr.edu.metu.ceng.xperimenter.feature;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class XprFeatureResolver {
	private static final int ARG_COUNT = 3;

	/**
	 * Resolves feature configurations by superimposing selected features on xperimenter specification.
	 * @param args[0] source simulation experiment specification (xpr file).
	 * @param args[1] feature configuration (expected format is a feature-ide compliant one)
	 * @param args[2] output xpr file.
	 */
	public static void main(String[] args) {
		boolean isGenEnabled = true;
		List<String> featureCfg = null;
		List<String> outLineList = new ArrayList<String>();
		
		if (args.length < XprFeatureResolver.ARG_COUNT)
		{
			System.err.println("ERROR: Invalid parameter count.\n Correct usage; java XprFeatureResolver <xpr_src_file> <feature_file> <xpr_tgt_file>");
			return;
		}
		
		// get all features into a list
		try {
			System.out.println("Selected Features:");
			featureCfg = Files.readAllLines(Paths.get(args[1]));
			for (String line : featureCfg) {
				System.out.println("* " + line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// TODO: handle empty feature list.
		
		// seek through source file and generate each line if it is between feature braces
		try {
			System.out.println("\nProcessing input file: " + args[0]);
			List<String> xprSource = Files.readAllLines(Paths.get(args[0]));
			for (String line : xprSource) {
				
				// if the line is a feature switch update the flag else if the flag is on, write the line to target file
				
				if (line.startsWith("#ifdef"))
				{
					String[] tokens = line.trim().split(" ");
					isGenEnabled = featureCfg.contains(tokens[1]);
				}
				else if (line.startsWith("#endif"))
				{
					isGenEnabled = true;
				}
				else if (isGenEnabled)
					outLineList.add(line);
			}
			System.out.println("\nGenerating output file: " + args[2]);
			Files.write(Paths.get(args[2]),outLineList,Charset.defaultCharset());
			System.out.println("\nDone!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
