import java.util.ArrayList;

public class DataMunging {

    public DataFactory dataFactory;

    protected DataModel getDataModelSatisfiedCondition(ArrayList<DataModel> dataModels) {
        DataModel dataModelSatisfyingCondition = null;

        for(DataModel datamodel:dataModels){

            if(datamodel.isConditionSatisfied(dataModelSatisfyingCondition)) {
                dataModelSatisfyingCondition = datamodel;
            }
        }
        return dataModelSatisfyingCondition;
    }
}
