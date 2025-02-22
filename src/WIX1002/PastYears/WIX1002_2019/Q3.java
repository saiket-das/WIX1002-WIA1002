package WIX1002.PastYears.WIX1002_2019;

import java.util.*;

public class Q3 {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter genome string [quit to stop] : ");
            String genome = input.nextLine();

            // If string == "QUIT" or "quit", then break the loop
            if (genome.equalsIgnoreCase("quit")) {
                break;
            }

            // Extract GENES from GENOME String
            ArrayList<String> genes = extractGenes(genome);

            if (genes.isEmpty()) {
                System.out.println("No gene is found");
            } else {
                for (String gene : genes) {
                    System.out.println(gene);
                }
            }

        }

        input.close();
    }

    // Extract all GENE from GENOME String
    public static ArrayList<String> extractGenes(String genome) {
        ArrayList<String> genes = new ArrayList<>();

        int startIndex = 0;
        while (startIndex < genome.length()) {
            // Find the start codon ATG
            startIndex = genome.indexOf("ATG", startIndex);
            if (startIndex == -1) {
                break; // No more start codons
            }

            // Look for the stop codons TAG, TAA, TGA
            int endIndex = findStopCodon(genome, startIndex + 3);
            if (endIndex != -1) {
                String gene = genome.substring(startIndex + 3, endIndex);

                // Check if the gene is valid
                if (isValidGene(gene)) {
                    genes.add(gene);
                }

                startIndex = endIndex + 3; // Move past the stop codon
            } else {
                break; // No valid stop codon found
            }
        }

        return genes;
    }

    // Find end index of ("TAG, "TAA", "TGA" triplet)
    // If not found then return -1
    public static int findStopCodon(String genome, int start) {
        int tagIndex = genome.indexOf("TAG", start);
        int taaIndex = genome.indexOf("TAA", start);
        int tgaIndex = genome.indexOf("TGA", start);

        // Find the nearest stop codon that is a multiple of 3 away from the start
        int minIndex = Integer.MAX_VALUE;
        if (tagIndex != -1 && (tagIndex - start) % 3 == 0)
            minIndex = Math.min(minIndex, tagIndex);
        if (taaIndex != -1 && (taaIndex - start) % 3 == 0)
            minIndex = Math.min(minIndex, taaIndex);
        if (tgaIndex != -1 && (tgaIndex - start) % 3 == 0)
            minIndex = Math.min(minIndex, tgaIndex);

        return (minIndex == Integer.MAX_VALUE) ? -1 : minIndex;
    }

    public static boolean isValidGene(String gene) {
        // Check that the gene does not contain the triplets ATG, TAG, TAA, TGA
        // Case for "ATGTGA" (GENOME is valid but gene is empty, so answer should be no
        // gene)
        return !gene.contains("ATG") &&
                !gene.contains("TAG") &&
                !gene.contains("TAA") &&
                !gene.contains("TGA");
    }
}

// TTATGTTTTAAGGATGGGGCGTTAGTT
// GGTATGATGGGTTGA
