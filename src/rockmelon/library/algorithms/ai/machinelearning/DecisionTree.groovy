package rockmelon.library.algorithms.ai.machinelearning

import weka.classifiers.Classifier
import weka.classifiers.Evaluation
import weka.classifiers.trees.Id3
import weka.classifiers.trees.J48
import weka.core.Instances
import weka.core.converters.ArffLoader

/**
 * Created by reid gareth on 2/25/19.
 */
public class DecisionTree {
    public void execute() throws Exception {

        Instances trainingDataSet = getDataSet("testFiles/houseTrainingData.arff");
        //Instances testingDataSet = getDataSet(TESTING_DATA_SET_FILENAME);

        System.out.println("************************** J48 *************************");
        /** Classifier here is Linear Regression */
        Classifier classifier = new J48();

        //J48,Id3
        /** */
        classifier.buildClassifier(trainingDataSet);
        /**
         * train the alogorithm with the training data and evaluate the
         * algorithm with testing data
         */
        Evaluation eval = new Evaluation(trainingDataSet);
        //eval.evaluateModel(classifier, testingDataSet);
        /** Print the algorithm summary */
        System.out.println("** Decision Tress Evaluation with Datasets **");
        System.out.println(eval.toSummaryString());
        System.out.print(" the expression for the input data as per alogorithm is ");
        System.out.println(classifier);
        System.out.println(eval.toMatrixString());
        System.out.println(eval.toClassDetailsString());

        System.out.println("************************** ID3 *************************");
        /** Classifier here is Linear Regression */
        Classifier id3Classifier = new Id3();

        //J48,Id3
        /** */
        id3Classifier.buildClassifier(trainingDataSet);
        /**
         * train the alogorithm with the training data and evaluate the
         * algorithm with testing data
         */
        Evaluation evalId3 = new Evaluation(trainingDataSet);
        //evalId3.evaluateModel(id3Classifier, testingDataSet);
        /** Print the algorithm summary */
        System.out.println("** Decision Tress Evaluation with Datasets **");
        System.out.println(evalId3.toSummaryString());
        System.out.print(" the expression for the input data as per alogorithm is ");
        System.out.println(id3Classifier);
        System.out.println(evalId3.toMatrixString());
        System.out.println(evalId3.toClassDetailsString());

    }

    public static Instances getDataSet(String fileName) throws IOException {
        /**
         * we can set the file i.e., loader.setFile("finename") to load the data
         */
        int classIdx = 1;
        /** the arffloader to load the arff file */
        ArffLoader loader = new ArffLoader();
        /** load the traing data */
        loader.setSource(new File(fileName));
        /**
         * we can also set the file like loader3.setFile(new
         * File("test-confused.arff"));
         */
        //loader.setFile(new File(fileName));
        Instances dataSet = loader.getDataSet();
        /** set the index based on the data given in the arff files */
        dataSet.setClassIndex(classIdx);
        return dataSet;
    }

}
