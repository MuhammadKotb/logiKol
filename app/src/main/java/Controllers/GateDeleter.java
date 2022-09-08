package Controllers;

import UIObjects.BasicGateUI;
import UIObjects.IONode;

public class GateDeleter {

    private LogicalGraph logicalGraph;
    private IOConnectionsController ioConnectionsController;
    
    public GateDeleter(LogicalGraph logicalGraph, IOConnectionsController ioConnectionsController)
    {
        this.logicalGraph = logicalGraph;
        this.ioConnectionsController = ioConnectionsController;
    }

    public void deleteGate(BasicGateUI gateUI, IOConnectionsController ioConnectionsController)
    {

        for(IONode inNode : ioConnectionsController.getOutInNodesMap().get(gateUI.getOutNode()))
        {
            this.logicalGraph.disconnect(inNode, gateUI.getOutNode());
        }

        ioConnectionsController.deleteOutNode(gateUI.getOutNode());
        gateUI.getRoot().getChildren().removeAll(gateUI.getTexture(), gateUI.getOutNode().node);
        for(IONode node : gateUI.getInNodes())
        {
            ioConnectionsController.deleteInNode(node);
            gateUI.getRoot().getChildren().remove(node.node);
        }
        logicalGraph.removeGate(gateUI);
    }

    public synchronized void removeInputNode(IONode node, IOConnectionsController ioConnectionsController)
    {

        this.logicalGraph.disconnect(node, ioConnectionsController.getInOutNodesMap().get(node));
        ioConnectionsController.removeInConnection(node);
    }



    
}
