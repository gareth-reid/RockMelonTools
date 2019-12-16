package rockmelon.library.algorithms.ai.machinelearning

import weka.classifiers.bayes.NaiveBayes
import weka.datagenerators.Test
import weka.gui.beans.DataSink

import java.io.IOException;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ArffLoader;

/**
 * This class is used to explain the Linear Regression with Java.
 *
 * @author Gowtham Girithar Srirangasamy
 *
 */
public class LinearRegression {

    /** file names are defined*/
    public static final String TRAINING_DATA_SET_FILENAME="testFiles/houseTrainingData.arff";
    public static final String TESTING_DATA_SET_FILENAME="testFiles/housetest.arff";
    public static final String PREDICTION_DATA_SET_FILENAME="testFiles/predictHouse.arff";

    /**
     * This method is used to process the input and return the statistics.
     *
     * @throws Exception
     */
    public void execute() throws Exception {
        int classIndex = 4
        Instances trainingDataSet = getDataSet(TRAINING_DATA_SET_FILENAME);
        Instances testingDataSet = getDataSet(TESTING_DATA_SET_FILENAME);

        /** Classifier here is Linear Regression */
        trainingDataSet.setClassIndex(classIndex);

        /**Regression classifier */
        Classifier classifier = new weka.classifiers.functions.LeastMedSq();
        classifier.buildClassifier(trainingDataSet);
        /**load test data*/
        //Evaluation eval = new Evaluation(trainingDataSet);
        //eval.evaluateModel(classifier, testingDataSet);

        Instances predictionDataSet = getDataSet(PREDICTION_DATA_SET_FILENAME);
        predictionDataSet.setClassIndex(classIndex);

        for (int i = 0; i < predictionDataSet.numInstances(); i++) {
            Instance newInst = predictionDataSet.instance(i);
            double prediction = classifier.classifyInstance(newInst);
           // System.out.println(classifier);

            System.out.println("Prediction: " + prediction);
        }
 }

    /**
     * This method is to load the data set.
     * @param fileName
     * @return
     * @throws IOException
     */
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
        Instances dataSet = loader.getDataSet();
        /** set the index based on the data given in the arff files */
        dataSet.setClassIndex(classIdx);
        return dataSet;
    }
}
