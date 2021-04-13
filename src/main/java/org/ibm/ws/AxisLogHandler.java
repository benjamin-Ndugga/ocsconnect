package org.ibm.ws;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.utils.Messages;

/**
 *
 * @author Benjamin E Ndugga
 */
public class AxisLogHandler extends BasicHandler {

    private static final Logger LOGGER = Logger.getLogger(AxisLogHandler.class.getName());

    @Override
    public void invoke(MessageContext mc) throws AxisFault {
        try {
            System.out.println("invoke message...");
            logMessage(mc);
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
    }

    private void logMessage(MessageContext mc) throws Exception {
        Message inMsg = mc.getRequestMessage();
        Message outMsg = mc.getResponseMessage();
        if (outMsg == null) {
            //replace it with logger if you need it log in different file.
            LOGGER.log(Level.INFO, "============================= REQUEST ============================================");
            LOGGER.log(Level.INFO, Messages.getMessage("inMsg00", (inMsg == null ? "" : inMsg.getSOAPEnvelope().getAsString())));
        } else {
            LOGGER.log(Level.INFO, "===================================RESPONSE======================================");
            LOGGER.log(Level.INFO, Messages.getMessage("outMsg00", (outMsg == null ? "" : outMsg.getSOAPEnvelope().getAsString())));
        }
    }

    @Override
    public void onFault(MessageContext msgContext) {
        super.onFault(msgContext);
        try {
            logMessage(msgContext);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
