package com.blackcoders.flags

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.blackcoders.flags.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {
    val binding by lazy { ActivityQuizBinding.inflate(layoutInflater) }

    var gCurrentProgress: Int = 1
    var gQuestionsList: ArrayList<Question>? = null
    var gSelectedOptionPosition: Int? = null
    var gSelectedAnswer: Boolean = false

    var gScore: Int = 0

    var question: TextView? = null
    var image: ImageView? = null
    var progressBar: ProgressBar? = null
    var progressText: TextView? = null
    var optionOne: Button? = null
    var optionTwo: Button? = null
    var optionThree: Button? = null
    var optionFour: Button? = null
    var nextButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        question = binding.activityQuizTitle
        image = binding.activityQuizFlagImage
        progressBar = binding.activityQuizProgressBar
        progressText = binding.activityQuizProgressBarText
        optionOne = binding.activityQuizAnswer1
        optionTwo = binding.activityQuizAnswer2
        optionThree = binding.activityQuizAnswer3
        optionFour = binding.activityQuizAnswer4
        nextButton = binding.activityQuizNextBtn

        gQuestionsList = Constants.getQuestions()
        setQuestion()

        nextButton!!.setOnClickListener {
            if (gCurrentProgress == 27) {
                val intent = Intent(this, FinishActivity::class.java)
                intent.putExtra("gScore", gScore)
                startActivity(intent)
            } else {
                gCurrentProgress++
                setQuestion()
                enableButtons()
            }
        }
    }

    private fun setQuestion() {
        setDefault()

        val currentQuestion: Question = gQuestionsList!![gCurrentProgress - 1]

        progressBar?.progress = gCurrentProgress
        progressText?.text = "$gCurrentProgress/${progressBar?.max}"

        question?.text = currentQuestion.question
        image?.setImageResource(currentQuestion.image)

        optionOne?.text = currentQuestion.optionOne
        optionTwo?.text = currentQuestion.optionTwo
        optionThree?.text = currentQuestion.optionThree
        optionFour?.text = currentQuestion.optionFour

        binding.activityQuizAnswer1.setOnClickListener {
            if (currentQuestion.answer == 1) {
                binding.activityQuizAnswer1.setTextColor(resources.getColor(R.color.limeGreen))
                gScore++
            } else {
                binding.activityQuizAnswer1.setTextColor(resources.getColor(R.color.red))
            }
            disableButtons()
        }

        binding.activityQuizAnswer2.setOnClickListener {
            if (currentQuestion.answer == 2) {
                binding.activityQuizAnswer2.setTextColor(resources.getColor(R.color.limeGreen))
                gScore++
            } else {
                binding.activityQuizAnswer2.setTextColor(resources.getColor(R.color.red))
            }
            disableButtons()
        }

        binding.activityQuizAnswer3.setOnClickListener {
            if (currentQuestion.answer == 3) {
                binding.activityQuizAnswer3.setTextColor(resources.getColor(R.color.limeGreen))
                gScore++
            } else {
                binding.activityQuizAnswer3.setTextColor(resources.getColor(R.color.red))
            }
            disableButtons()
        }

        binding.activityQuizAnswer4.setOnClickListener {
            if (currentQuestion.answer == 4) {
                binding.activityQuizAnswer4.setTextColor(resources.getColor(R.color.limeGreen))
                gScore++
            } else {
                binding.activityQuizAnswer4.setTextColor(resources.getColor(R.color.red))
            }
            disableButtons()
        }
    }

    private fun setDefault() {
        optionOne?.setTextColor(Color.GRAY)
        optionTwo?.setTextColor(Color.GRAY)
        optionThree?.setTextColor(Color.GRAY)
        optionFour?.setTextColor(Color.GRAY)
    }

    private fun disableButtons() {
        optionOne?.isEnabled = false
        optionTwo?.isEnabled = false
        optionThree?.isEnabled = false
        optionFour?.isEnabled = false
    }

    private fun enableButtons() {
        optionOne?.isEnabled = true
        optionTwo?.isEnabled = true
        optionThree?.isEnabled = true
        optionFour?.isEnabled = true
    }

}