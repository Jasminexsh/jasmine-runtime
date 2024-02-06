package com.jasmine.runtime.facade;

import com.jasmine.runtime.facade.model.DubboDemoQueryRequest;
import com.jasmine.runtime.facade.model.DubboDemoQueryResponse;

/**
 * @author xieshanghan
 * @version DubboDemoFacade.java v 0.1, 2024/2/5 xieshanghan
 */
public interface DubboDemoFacade {

    DubboDemoQueryResponse queryDubboDemoInfo(DubboDemoQueryRequest request);

}