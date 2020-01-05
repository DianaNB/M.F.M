//package org.launchcode.MFM.controllers;
//
//import org.launchcode.MFM.models.Playlist;
//import org.launchcode.MFM.models.data.MusicDao;
//import org.launchcode.MFM.models.data.PlaylistDao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.Errors;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.validation.Valid;
//
//@Controller
//@RequestMapping(value = "playlist")
//public class PlaylistController {
//
//    @Autowired
//    private PlaylistDao playlistDao;
//
//    @Autowired
//    private MusicDao musicDao;
//
//    @RequestMapping(value="")
//    public String index(Model model) {
//        model.addAttribute("playlists", playlistDao.findAll());
//        model.addAttribute("title", "Playlists");
//        return "/playlist";
//    }
//
//    @RequestMapping(value = "add", method = RequestMethod.GET)
//    public String addPlaylist(Model model, Playlist playlist) {
//        model.addAttribute("playlist", playlist);
//        return "playlist/add";
//    }
//
//    @RequestMapping(value = "add", method = RequestMethod.POST)
//    public String addPlaylist(Model model, @ModelAttribute @Valid Playlist playlist, Errors errors) {
//        if(errors.haserrors()) {
//            return "playlist/add";
//        }else{
//            playlistDao.save(playlist);
//            int id = playlist.getId();
//
//            return "redirect:view/" + id;
//        }
//    }
//}
