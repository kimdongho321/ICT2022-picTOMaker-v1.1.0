import {useRef, useState} from "react";
import "../../css/Community.css";

const CEditor = ({onCreate}) => {
    const authorInput = useRef();
    const contentInput = useRef();

    const [state, setState] = useState({
        author:"",
        content:"",
        emotion:1,
    });

    const handleChangeComment = (e) => {
        setState({
            ...state,
            [e.target.name]: e.target.value,
        });
    };

    const handleSubmit = () => {
        if (state.author.length < 1) {
          authorInput.current.focus();
          return;
        }
    
        if (state.content.length < 5) {
          contentInput.current.focus();
          return;
        }
    
        onCreate(state.author, state.content, state.emotion);
        alert("저장 성공");
        setState({
          author: "",
          content: "",
          emotion: 1
        });
      };
    return(
        <div className="CommunityEditor">
            <div>
                <span>제목</span>
                <input
                ref={authorInput}
                name="author"
                type="text"
                value={state.author}
                onChange={handleChangeComment}
                />
                <div>
                    <textarea
                    ref={contentInput}
                    name="content"
                    type="text"
                    value={state.content}
                    onChange={handleChangeComment}
                    />
                </div>
            </div>
            <div>
                <button onClick={handleSubmit}>저장하기</button>
            </div>
        </div>
    )
}

export default CEditor;