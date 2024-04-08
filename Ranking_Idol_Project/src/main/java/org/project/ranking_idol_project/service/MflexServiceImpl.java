//package org.project.ranking_idol_project.service;
//
//import org.project.ranking_idol_project.document.MflexDocument;
//import org.project.ranking_idol_project.repository.MflexRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//// implements : 부모객체에서 메소드나 변수를 선언만하고 기능은 자식클래스에서 Override로 구현(implements)하는 것
//@Service
//public class MflexServiceImpl implements MflexService {
//    private final MflexRepository mflexRepository;
//
//    @Autowired
//    public MflexServiceImpl(MflexRepository mflexRepository) {
//        this.mflexRepository = mflexRepository;
//    }
//
//    @Override
//    public MflexDocument createUser(MflexDocument user) {
//        return mflexRepository.save(user);
//    }
//
//    @Override
//    public List<MflexDocument> getAllUsers() {
//        return mflexRepository.findAll();
//    }
//
//    @Override
//    public MflexDocument getUserById(String id) {
//        return mflexRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public void deleteUserById(String id) {
//        mflexRepository.deleteById(id);
//    }
//}
