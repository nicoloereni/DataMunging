import java.util.ArrayList;

public class DataMunging {

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
